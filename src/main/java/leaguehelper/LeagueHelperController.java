package leaguehelper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LeagueHelperController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sample")
    public SampleDTO greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new SampleDTO(name.concat((((Long) counter.get()).toString())));
    }
}
