package leaguehelper;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import leaguehelper.dto.ImmutableFriendRating;
import leaguehelper.dto.ImmutableMatch;
import leaguehelper.dto.ImmutableMatchList;
import leaguehelper.dto.ImmutableParticipant;
import leaguehelper.dto.ImmutableParticipantStats;
import leaguehelper.dto.ImmutablePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class RiotApiHelper {
    private static final Logger log = LoggerFactory.getLogger(RiotApiHelper.class);
    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson;
    private final String rapiKey;
    private final Long accountId;

    private static final String matchListUrl = "https://na1.api.riotgames.com/lol/match/v3/matchlists/by-account/";
    private static final String seasonQueryParam = "?season=9";
    private static final String matchUrl = "https://na1.api.riotgames.com/lol/match/v3/matches/";

    @Autowired
    public RiotApiHelper(String rapiKey, Long accountId, Gson gson) {
        this.rapiKey = Objects.requireNonNull(rapiKey);
        this.accountId = Objects.requireNonNull(accountId);
        this.gson = Objects.requireNonNull(gson);
    }

    public ImmutableMatchList getMatchList() {
        try {
            Request request = new Request.Builder()
                    .url(new StringBuilder(matchListUrl).append(accountId).append(seasonQueryParam).toString())
                    .addHeader("X-Riot-Token", rapiKey)
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                log.error("Calling Riot API matches failed with " + response.message());
            }
            String json = response.body().string();
            ImmutableMatchList matchList = gson.fromJson(json, ImmutableMatchList.class);
            return matchList;
        } catch (IOException ex) {
            log.error("Calling Riot API matches failed", ex);
            return null;
        }
    }

    public ImmutableMatch getMatch(String gameId) {
        try {
            String requestUrl = new StringBuilder(matchUrl)
                    .append(gameId)
                    .append("?forAccountId=")
                    .append(accountId)
                    .toString();
            Request request = new Request.Builder()
                    .url(requestUrl)
                    .addHeader("X-Riot-Token", rapiKey)
                    .build();
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                log.error("Calling Riot API match endpoint failed with " + response.message());
            }
            String json = response.body().string();
            ImmutableMatch match = gson.fromJson(json, ImmutableMatch.class);
            return match;
        } catch (IOException ex) {
            log.error("Calling Riot match endpoint failed", ex);
            return null;
        }
    }

    public List<ImmutableFriendRating> getFriendRatingsForMatch(ImmutableMatch match) {
        int teamId = getTeamIdForAccount(accountId, match);
        ImmutableList.Builder<ImmutableFriendRating>  friendRatings = ImmutableList.builder();

        List<ImmutableParticipant> participants
                = match.participants().stream().filter(p -> p.teamId() == teamId).collect(Collectors.toList());

        for (ImmutableParticipant participant : participants) {
            ImmutablePlayer player = match.participantIdentities().stream()
                    .filter(p -> p.participantId() == participant.participantId())
                    .findFirst().get().player();
            if (player.accountId() != accountId) {
                friendRatings.add(getFriendRatingFromStats(participant.stats(), player));
            }
        }

        return friendRatings.build();
    }

    @VisibleForTesting
    public static ImmutableFriendRating getFriendRatingFromStats(ImmutableParticipantStats stats, ImmutablePlayer player) {
        return ImmutableFriendRating.builder()
            .id(player.accountId())
            .summonerName(player.summonerName())
            .gamesPlayed(1)
            .kills(stats.kills())
            .deaths(stats.deaths())
            .assists(stats.assists())
            .wins(stats.win() ? 1 : 0)
            .build();
    }

    @VisibleForTesting
    public static int getTeamIdForAccount(long accountId, ImmutableMatch match) {
        int participantId = getParticipantIdForAccount(accountId, match);
        return match.participants().stream()
                .filter(p -> p.participantId() == participantId)
                .findFirst().get().teamId();
    }

    @VisibleForTesting
    public static int getParticipantIdForAccount(long accountId, ImmutableMatch match) {
        return match.participantIdentities().stream()
                .filter(p -> p.player().currentAccountId() == accountId)
                .findFirst().get().participantId();
    }
}
