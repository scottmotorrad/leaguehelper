package leaguehelper;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LeagueHelperController {

    private final AtomicLong counter = new AtomicLong();
    private static final String prefix = "/api/v1";

    @RequestMapping(path = (prefix + "/sample"), method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "exactly")
    public SampleDTO getSample(
            @ApiParam(value = "precisely")
            @RequestParam(value = "name", defaultValue = "World") String name) {
        return new SampleDTO(name.concat((((Long) counter.getAndAdd(1)).toString())));
    }
}
