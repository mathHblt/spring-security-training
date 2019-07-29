package arhs.training.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ARHS Spikeseed.
 */
@Controller
public class HomeController {

    @GetMapping({ "", "/home" })
    public String getHome() {
        return "home";
    }
}
