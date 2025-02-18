package hiber.controllers;

import hiber.config.HiberConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import hiber.model.User;
import hiber.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public String GetAllUsers(ModelMap model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "users";
    }
}
