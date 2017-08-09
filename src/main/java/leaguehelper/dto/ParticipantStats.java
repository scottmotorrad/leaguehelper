package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class ParticipantStats {
    public abstract boolean win();
    public abstract int deaths();
    public abstract int kills();
    public abstract int assists();
}
