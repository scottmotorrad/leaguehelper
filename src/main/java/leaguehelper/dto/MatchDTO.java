package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public final class MatchDTO {
    private final long gameId;
    private final List<ParticipantIdentityDTO> participantIdentities;
    private final List<TeamStatsDTO> teams;
    private final List<ParticipantDTO> participants;
}
