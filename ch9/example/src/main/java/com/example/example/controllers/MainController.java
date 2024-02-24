package com.example.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.example.services.LoggedUserManagementService;
import com.example.example.services.LoginCountService;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MainController(
            LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;

    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout, Model model) {
        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }
        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username", username);
        model.addAttribute("loginCount", count);
        return "main.html";
    }
}
