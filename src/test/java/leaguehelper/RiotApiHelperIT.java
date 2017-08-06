package leaguehelper;

import static org.junit.Assert.assertNotNull;

import leaguehelper.dto.MatchListDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RiotApiHelper.class})
public class RiotApiHelperIT {

    @Test
    public void test() {
        RiotApiHelper helper =  new RiotApiHelper();
        MatchListDTO matchListDTO = helper.getMatches();
        helper.getTeamForMatch(Long.toString(matchListDTO.getMatches().get(0).getGameId()));
        assertNotNull("");
    }
}