package arhs.training.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import arhs.training.springsecurity.domain.dto.request.LoginFormRequestDTO;

/**
 * Created by ARHS Spikeseed.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginFormRequestDTO", new LoginFormRequestDTO());
        return "login";
    }
}
