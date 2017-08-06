package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FriendRating {
    private final long id;
    private final String summonerName;
    private final Rating rating;

    public enum Rating {
        SOLO,
        FLEX,
        NORMS
    }
}
