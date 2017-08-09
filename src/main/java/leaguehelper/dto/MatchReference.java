package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class MatchReference {
    public abstract String lane();
    public abstract long gameId();
    public abstract int champion();
    public abstract String platformId();
    public abstract int season();
    public abstract int queue();
    public abstract String role();
    public abstract long timestamp();
}
