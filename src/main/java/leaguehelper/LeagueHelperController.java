package leaguehelper;

import com.google.common.collect.ImmutableList;
import io.swagger.annotations.ApiOperation;
import leaguehelper.dto.FriendRating;
import leaguehelper.dto.FriendRating.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LeagueHelperController {
    private static final String prefix = "/api/v1";
    @Autowired
    private TaskScheduler scheduler;

    @RequestMapping(path = (prefix + "/friends"), method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get friends ratings")
    public List<FriendRating> getFriendRatings() {
        FriendRating rating = new FriendRating(1,"", Rating.FLEX);
        return ImmutableList.of(rating);
    }


}
