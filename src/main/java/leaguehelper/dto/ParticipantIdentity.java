package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class ParticipantIdentity {
    public abstract ImmutablePlayer player();
    public abstract int participantId();
}
