package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class TeamStats {
    public abstract int teamId();
    public abstract String win();
}
