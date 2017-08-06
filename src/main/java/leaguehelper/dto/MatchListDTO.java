package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class MatchListDTO {
    private final int totalGames;
    private final int startIndex;
    private final int endIndex;
    private final List<MatchReferenceDTO> matches;
}
