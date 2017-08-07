package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class ParticipantStatsDTO {
    private final boolean win;
    private final int deaths;
    private final int kills;
    private final int assists;
}