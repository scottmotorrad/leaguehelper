package leaguehelper.dto;

import org.immutables.value.Value;
import java.util.Comparator;

@Value.Immutable
public abstract class FriendRating {
    public abstract long id();
    public abstract String summonerName();
    public abstract int gamesPlayed();
    public abstract int kills();
    public abstract int deaths();
    public abstract int assists();
    public abstract int wins();

    //these are required here to return to the endpoint. maybe tehre is an annotation?
    public long getId() {
        return id();
    }

    public String getSummonerName()  {
        return summonerName();
    }

    public int getGamesPlayed() {
        return gamesPlayed();
    }

    public int getKills() {
        return kills();
    }

    public int getDeaths() {
        return deaths();
    }

    public int getAssists() {
        return assists();
    }

    public int getWins() {
        return wins();
    }

    public Rating getRating() {
        double winrate = gamesPlayed() > 0 ? (double)wins() / (double)gamesPlayed() : 0.0d;

        if (winrate < 0.5d) {
            return Rating.NORMS;
        }

        if (winrate > 0.6d || getKDA() > 3.0d) {
            return Rating.SOLO;
        }

        return Rating.FLEX;
    }

    public double getKDA() {
        return deaths() > 0 ? ((double)kills() + (double)assists()) / (double)deaths() : 999.0d;
    }

    public enum Rating {
        SOLO,
        FLEX,
        NORMS
    }

    public ImmutableFriendRating merge(ImmutableFriendRating newRating) {
        return ImmutableFriendRating.builder()
            .from(this)
            .gamesPlayed(gamesPlayed() + newRating.gamesPlayed())
            .kills(kills() + newRating.kills())
            .deaths(deaths() + newRating.deaths())
            .assists(assists() + newRating.assists())
            .wins(wins() + newRating.wins())
            .build();
    }

    public static Comparator<FriendRating> mostWinsFirstComparator = new Comparator<FriendRating>() {
        @Override
        public int compare(FriendRating o1, FriendRating o2) {
            return o2.wins() - o1.wins();
        }
    };
}
