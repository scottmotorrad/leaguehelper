package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class Player {
    public abstract String summonerName();
    public abstract long currentAccountId();
    public abstract long summonerId();
    public abstract long accountId();
}
