package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class Participant {
    public abstract ImmutableParticipantStats stats();
    public abstract int participantId();
    public abstract int teamId();
}
