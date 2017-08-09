package leaguehelper;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import leaguehelper.dto.FriendRating.Rating;
import leaguehelper.dto.ImmutableFriendRating;
import leaguehelper.dto.ImmutableMatch;
import leaguehelper.dto.ImmutableParticipantStats;
import leaguehelper.dto.ImmutablePlayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import java.util.ServiceLoader;

@RunWith(SpringJUnit4ClassRunner.class)
public class RiotApiHelperIT {

    private Gson gson;
    private final long testAccountId = 37455819L;

    private ImmutableMatch testMatch;
    private ImmutableParticipantStats testParticipantStats;
    private ImmutablePlayer testPlayer;
    private RiotApiHelper helper;

    @Before
    public void testSetup() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }
        gson = gsonBuilder.create();

        // TODO use mock web server to mock returning this over the wire instead of just using static JSON
        testMatch = gson.fromJson(TestData.matchDataJson, ImmutableMatch.class);
        testParticipantStats  = gson.fromJson(TestData.participantStatsJson,
            ImmutableParticipantStats.class);
        testPlayer  = gson.fromJson(TestData.playerJson, ImmutablePlayer.class);
        helper = new RiotApiHelper("test", testAccountId, gson);
    }

    @Test
    public void testGetTeamIdForAccount() {
        int actual = RiotApiHelper.getTeamIdForAccount(testAccountId, testMatch);
        assertEquals(200, actual);
    }

    @Test
    public void testGetFriendRatingFromStats() {
        ImmutableFriendRating actual = RiotApiHelper.getFriendRatingFromStats(testParticipantStats, testPlayer);
        assertEquals(1, actual.wins());
        assertEquals(2, actual.deaths());
        assertEquals(Rating.SOLO, actual.getRating());
    }

    @Test
    public void testGetFriendRatingsForMatch() {
        List<ImmutableFriendRating> actual = helper.getFriendRatingsForMatch(testMatch);
        assertEquals(2, actual.size());
    }

    @Test
    public void testGetParticipantIdForAccount() {
        int actual = RiotApiHelper.getParticipantIdForAccount(testAccountId, testMatch);
        assertEquals(4, actual);
    }
}
