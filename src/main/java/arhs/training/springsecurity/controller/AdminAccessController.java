package arhs.training.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import arhs.training.springsecurity.service.UserService;

/**
 * Created by ARHS Spikeseed.
 */
@Controller
public class AdminAccessController {

    private final UserService userService;

    @Autowired
    public AdminAccessController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String getSignupPage(Model model) {

        model.addAttribute("users", this.userService.findAll());
        return "admin";
    }

}
