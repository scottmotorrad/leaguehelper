package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import java.util.List;

@Gson.TypeAdapters
@Value.Immutable
public abstract class MatchList {
    public abstract int totalGames();
    public abstract int startIndex();
    public abstract int endIndex();
    public abstract List<ImmutableMatchReference> matches();
}
