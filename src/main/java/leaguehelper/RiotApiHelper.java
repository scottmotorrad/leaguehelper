package leaguehelper;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import leaguehelper.dto.FriendRatingDTO;
import leaguehelper.dto.MatchDTO;
import leaguehelper.dto.MatchListDTO;
import leaguehelper.dto.ParticipantDTO;
import leaguehelper.dto.ParticipantStatsDTO;
import leaguehelper.dto.PlayerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class RiotApiHelper {
    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson = new Gson();
    private final String rapiKey;
    private final Long accountId;

    private static final String matchListUrl = "https://na1.api.riotgames.com/lol/match/v3/matchlists/by-account/";
    private static final String seasonQueryParam = "?season=9";
    private static final String matchUrl = "https://na1.api.riotgames.com/lol/match/v3/matches/";

    @Autowired
    public RiotApiHelper(String rapiKey, Long accountId) {
        this.rapiKey = rapiKey;
        this.accountId = accountId;
    }

    public MatchListDTO getMatches() {
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
            MatchListDTO matchList = gson.fromJson(json, MatchListDTO.class);
            return matchList;
        } catch (IOException ex) {
            log.error("Calling Riot API matches failed", ex);
            return null;
        }
    }

    public MatchDTO getMatchDTO(String gameId) {
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
            MatchDTO match = gson.fromJson(json, MatchDTO.class);
            return match;
        } catch (IOException ex) {
            log.error("Calling Riot match endpoint failed", ex);
            return null;
        }
    }

    public List<FriendRatingDTO> getFriendRatingsForMatch(MatchDTO match) {
        int teamId = getTeamIdForAccount(accountId, match);
        List<FriendRatingDTO> friendRatings = new ArrayList<>(4);

        List<ParticipantDTO> participants
                = match.getParticipants().stream().filter(p -> p.getTeamId() == teamId).collect(Collectors.toList());

        for (ParticipantDTO participant : participants) {
            PlayerDTO player = match.getParticipantIdentities().stream()
                    .filter(p -> p.getParticipantId() == participant.getParticipantId())
                    .findFirst().get().getPlayer();
            if (player.getAccountId() != accountId) {
                friendRatings.add(getFriendRatingFromStats(participant.getStats(), player));
            }
        }

        return friendRatings;
    }

    @VisibleForTesting
    public static FriendRatingDTO getFriendRatingFromStats(ParticipantStatsDTO stats, PlayerDTO player) {
        return new FriendRatingDTO(
                player.getAccountId(),
                player.getSummonerName(),
                1,
                stats.getKills(),
                stats.getDeaths(),
                stats.getAssists(),
                stats.isWin() ? 1 : 0);

    }

    @VisibleForTesting
    public static int getTeamIdForAccount(long accountId, MatchDTO match) {
        int participantId = getParticipantIdForAccount(accountId, match);
        return match.getParticipants().stream()
                .filter(p -> p.getParticipantId() == participantId)
                .findFirst().get().getTeamId();
    }

    @VisibleForTesting
    public static int getParticipantIdForAccount(long accountId, MatchDTO match) {
        return match.getParticipantIdentities().stream()
                .filter(p -> p.getPlayer().getCurrentAccountId() == accountId)
                .findFirst().get().getParticipantId();
    }
}
