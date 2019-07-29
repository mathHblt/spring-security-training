package arhs.training.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import arhs.training.springsecurity.domain.dto.request.SignUpFormRequestDTO;
import arhs.training.springsecurity.service.UserService;

/**
 * Created by ARHS Spikeseed.
 */
@Controller
public class SignupController {


    private final UserService userService;

    @Autowired
    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signUp")
    public String getSignupPage(Model model) {
        model.addAttribute("signUpFormRequestDTO", new SignUpFormRequestDTO());
        return "signUp";
    }

    @PostMapping("/signUp")
    public RedirectView submitSignup(@ModelAttribute("signUpFormRequestDTO") SignUpFormRequestDTO signUpFormRequestDTO) {

        this.userService.saveUser(signUpFormRequestDTO);

        return new RedirectView("/home");
    }
}
