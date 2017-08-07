package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class TeamStatsDTO {
    private final int teamId;
    private final String win;
}