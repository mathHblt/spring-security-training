package arhs.training.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ARHS Spikeseed.
 */

@Controller
public class TeamController {


    @GetMapping("/teams")
    public String getTeamsPage() {

        return "teams";
    }

}
