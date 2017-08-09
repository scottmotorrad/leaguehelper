package leaguehelper;

import com.google.common.collect.ImmutableList;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.ir.annotations.Immutable;
import leaguehelper.dto.FriendRating;
import leaguehelper.dto.ImmutableFriendRating;
import leaguehelper.dto.ImmutableMatch;
import leaguehelper.dto.ImmutableMatchReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LeagueHelperController {
    private static final String prefix = "/api/v1";
    private TaskScheduler scheduler;
    private RiotApiHelper riotApiHelper;
    private volatile LinkedHashMap<Long, ImmutableFriendRating> ratingHashMap = new LinkedHashMap<>();
    private ImmutableList<ImmutableMatchReference> matches;


    @Autowired
    LeagueHelperController(TaskScheduler scheduler, RiotApiHelper riotApiHelper) {
        this.scheduler = scheduler;
        this.riotApiHelper = riotApiHelper;
        matches = riotApiHelper.getMatchList().matches();
        scheduler.scheduleWithFixedDelay(getFriendRatings, 1500L);
    }

    @RequestMapping(path = (prefix + "/friends"), method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get friends ratings")
    public List<ImmutableFriendRating> getFriendRatings() {
        return ratingHashMap.values().stream()
                .filter( r -> r.gamesPlayed() > 3)
                .sorted(ImmutableFriendRating.mostWinsFirstComparator).collect(Collectors.toList());
    }

    Runnable getFriendRatings = new Runnable() {
        @Override
        public void run() {
            synchronized (matches) {
                if (matches.size() > 0) {
                    ImmutableMatchReference matchReference = matches.get(0);
                    ImmutableMatch match = riotApiHelper.getMatch(Long.toString(matchReference.gameId()));
                    List<ImmutableFriendRating> friendRatings = riotApiHelper.getFriendRatingsForMatch(match);
                    synchronized (ratingHashMap) {
                        for (ImmutableFriendRating rating : friendRatings) {
                            if (ratingHashMap.containsKey(rating.id())) {
                                ratingHashMap.put(rating.id(), rating.merge(ratingHashMap.get(rating.id())));
                            } else {
                                ratingHashMap.put(rating.id(), rating);
                            }
                        }
                    }
                    System.out.println("Matches is " + matches);
                    matches = matches.subList(1, matches.size());
                }
            }
        }
    };

}
