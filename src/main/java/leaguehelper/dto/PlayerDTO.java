package leaguehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class PlayerDTO {
    private final String summonerName;
    private final long currentAccountId;
    private final long summonerId;
    private final long accountId;
}