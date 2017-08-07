package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ParticipantIdentityDTO {
    private final PlayerDTO player;
    private final int participantId;
}
