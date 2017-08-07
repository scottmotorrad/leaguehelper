package leaguehelper;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import leaguehelper.dto.FriendRatingDTO;
import leaguehelper.dto.FriendRatingDTO.Rating;
import leaguehelper.dto.MatchDTO;
import leaguehelper.dto.ParticipantStatsDTO;
import leaguehelper.dto.PlayerDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class RiotApiHelperIT {

    private final Gson gson = new Gson();
    private final long testAccountId = 37455819L;

    private MatchDTO testMatch;
    private ParticipantStatsDTO testParticipantStats;
    private PlayerDTO testPlayer;
    private RiotApiHelper helper;

    @Before
    public void testSetup() {
        // TODO use mock web server to mock returning this over the wire instead of just using static JSON
        testMatch = gson.fromJson(TestData.matchDataJson, MatchDTO.class);
        testParticipantStats  = gson.fromJson(TestData.participantStatsJson, ParticipantStatsDTO.class);
        testPlayer  = gson.fromJson(TestData.playerJson, PlayerDTO.class);
        helper = new RiotApiHelper("test", testAccountId);
    }

    @Test
    public void testGetTeamIdForAccount() {
        int actual = RiotApiHelper.getTeamIdForAccount(testAccountId, testMatch);
        assertEquals(200, actual);
    }

    @Test
    public void testGetFriendRatingFromStats() {
        FriendRatingDTO actual = RiotApiHelper.getFriendRatingFromStats(testParticipantStats, testPlayer);
        assertEquals(1, actual.getWins());
        assertEquals(2, actual.getDeaths());
        assertEquals(Rating.SOLO, actual.getRating());
    }

    @Test
    public void testGetFriendRatingsForMatch() {
        List<FriendRatingDTO> actual = helper.getFriendRatingsForMatch(testMatch);
        assertEquals(2, actual.size());
    }

    @Test
    public void testGetParticipantIdForAccount() {
        int actual = RiotApiHelper.getParticipantIdForAccount(testAccountId, testMatch);
        assertEquals(4, actual);
    }
}