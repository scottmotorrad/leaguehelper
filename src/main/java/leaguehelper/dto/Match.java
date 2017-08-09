package leaguehelper.dto;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import java.util.List;

@Gson.TypeAdapters
@Value.Immutable
public abstract class Match {
    public abstract long gameId();
    public abstract List<ImmutableParticipantIdentity> participantIdentities();
    public abstract List<ImmutableTeamStats> teams();
    public abstract List<ImmutableParticipant> participants();
}
