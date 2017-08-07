package leaguehelper;

import io.swagger.annotations.ApiOperation;
import leaguehelper.dto.FriendRatingDTO;
import leaguehelper.dto.MatchDTO;
import leaguehelper.dto.MatchReferenceDTO;
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
    private volatile LinkedHashMap<Long, FriendRatingDTO> ratingHashMap = new LinkedHashMap<>();
    private List<MatchReferenceDTO> matches;


    @Autowired
    LeagueHelperController(TaskScheduler scheduler, RiotApiHelper riotApiHelper) {
        this.scheduler = scheduler;
        this.riotApiHelper = riotApiHelper;
        matches = riotApiHelper.getMatches().getMatches();
        scheduler.scheduleWithFixedDelay(getFriendRatings, 1500L);
    }

    @RequestMapping(path = (prefix + "/friends"), method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get friends ratings")
    public List<FriendRatingDTO> getFriendRatings() {
        return ratingHashMap.values().stream()
                .filter( r -> r.getGamesPlayed() > 3)
                .sorted(FriendRatingDTO.mostWinsFirstComparator).collect(Collectors.toList());
    }

    Runnable getFriendRatings = new Runnable() {
        @Override
        public void run() {
            synchronized (matches) {
                if (matches.size() > 0) {
                    MatchReferenceDTO matchReference = matches.get(0);
                    MatchDTO match = riotApiHelper.getMatchDTO(Long.toString(matchReference.getGameId()));
                    List<FriendRatingDTO> friendRatings = riotApiHelper.getFriendRatingsForMatch(match);
                    synchronized (ratingHashMap) {
                        for (FriendRatingDTO rating : friendRatings) {
                            if (ratingHashMap.containsKey(rating.getId())) {
                                ratingHashMap.put(rating.getId(), rating.merge(ratingHashMap.get(rating.getId())));
                            } else {
                                ratingHashMap.put(rating.getId(), rating);
                            }
                        }
                    }
                    matches.remove(0);
                }
            }
        }
    };

}
