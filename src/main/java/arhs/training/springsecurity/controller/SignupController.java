package arhs.training.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ARHS Spikeseed.
 */
@Controller
public class SignupController {


    @GetMapping("/signUp")
    public String getSignupPage() {
        return "signUp";
    }
}
