package com.ibm.mose.demo.controller;

import com.ibm.mose.demo.entity.User;
import com.ibm.mose.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/addUser")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "register";
        }
        userService.save(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        List<User> list = userService.find(user);
        if (list.size() > 0) {
            return "redirect:/editUsers";
        }
        return "redirect:/";
    }

    @GetMapping("/editUsers")
    public String editUsers(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "editUsers";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }
}
