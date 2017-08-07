package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Comparator;

@Getter
@AllArgsConstructor
public final class FriendRatingDTO {
    private final long id;
    private final String summonerName;
    private final int gamesPlayed;
    private final int kills;
    private final int deaths;
    private final int assists;
    private final int wins;

    public Rating getRating() {
        double winrate = gamesPlayed > 0 ? (double)wins / (double)gamesPlayed : 0.0d;

        if (winrate < 0.5d) {
            return Rating.NORMS;
        }

        if (winrate > 0.6d || getKDA() > 3.0d) {
            return Rating.SOLO;
        }

        return Rating.FLEX;
    }

    public double getKDA() {
        return deaths > 0 ? ((double)kills + (double)assists) / (double)deaths : 999.0d;
    }

    public enum Rating {
        SOLO,
        FLEX,
        NORMS
    }

    public synchronized FriendRatingDTO merge(FriendRatingDTO newRating) {
        synchronized (newRating) {
            return new FriendRatingDTO(
                    id,
                    summonerName,
                    gamesPlayed + newRating.getGamesPlayed(),
                    kills + newRating.getKills(),
                    deaths + newRating.getDeaths(),
                    assists + newRating.getAssists(),
                    wins + newRating.getWins());
        }
    }

    public static Comparator<FriendRatingDTO> mostWinsFirstComparator = new Comparator<FriendRatingDTO>() {
        @Override
        public int compare(FriendRatingDTO o1, FriendRatingDTO o2) {
            return o2.getWins() - o1.getWins();
        }
    };
}
