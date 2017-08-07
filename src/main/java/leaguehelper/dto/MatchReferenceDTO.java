package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class MatchReferenceDTO {
    private final String lane;
    private final long gameId;
    private final int champion;
    private final String platformId;
    private final int season;
    private final int queue;
    private final String role;
    private final long timestamp;
}
