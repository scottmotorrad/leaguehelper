package leaguehelper;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import leaguehelper.dto.MatchListDTO;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;

@Slf4j
public class RiotApiHelper {
    private final OkHttpClient client = new OkHttpClient();
    private Gson gson = new Gson();
    private final String accountId = "37455819";
    private final StringBuilder matchListUrl
            = new StringBuilder("https://na1.api.riotgames.com/lol/match/v3/matchlists/by-account/");
    private final StringBuilder matchUrl
            = new StringBuilder("https://na1.api.riotgames.com/lol/match/v3/matches/");
    //TODO inject and read this from sys properties
    private final String apiKey = "";

    public MatchListDTO getMatches() {
        try {
            Request request = new Request.Builder()
                    .url(matchListUrl.append(accountId).toString())
                    .addHeader("X-Riot-Token", apiKey)
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

    public void getTeamForMatch(String gameId) {
        try {
            String requestUrl = matchUrl
                    .append(gameId)
                    .append("?forAccountId=")
                    .append(accountId)
                    .toString();
            Request request = new Request.Builder()
                    .url(requestUrl)
                    .addHeader("X-Riot-Token", apiKey)
                    .build();
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                log.error("Calling Riot API match endpoint failed with " + response.message());
            }
            String json = response.body().string();

            return;
        } catch (IOException ex) {
            log.error("Calling Riot match endpoint failed", ex);
            return;
        }
    }
}
