package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class ParticipantDTO {
    private final ParticipantStatsDTO stats;
    private final int participantId;
    private final int teamId;
}