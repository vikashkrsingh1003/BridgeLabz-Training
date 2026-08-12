package com.demogreetingsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demogreetingsapp.model.User;
import com.demogreetingsapp.service.UserService;

@Controller
public class AuthController {

    private final UserService userService;

    // Constructor Injection
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // ==============================
    // Home
    // ==============================

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    // ==============================
    // Login Page
    // ==============================

    @GetMapping("/login")
    public String showLoginPage(Model model) {

        model.addAttribute("user", new User());

        return "login";
    }

    // ==============================
    // Registration Page
    // ==============================

    @GetMapping("/register")
    public String showRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    // ==============================
    // Registration
    // ==============================

    @PostMapping("/register")
    public String registerUser(
            @ModelAttribute("user") User user,
            Model model) {

        boolean result = userService.registerUser(user);

        if (result) {

            model.addAttribute(
                    "message",
                    "Registration successful! Please login."
            );

            return "login";
        }

        model.addAttribute(
                "error",
                "Username already exists."
        );

        return "register";
    }

    // ==============================
    // Login
    // ==============================

    @PostMapping("/login")
    public String loginUser(
            @ModelAttribute("user") User user,
            Model model) {

        User loggedInUser = userService.loginUser(
                user.getUsername(),
                user.getPassword()
        );

        if (loggedInUser != null) {

        	return "greeting";
        }

        model.addAttribute(
                "error",
                "Invalid username or password."
        );

        return "login";
    }
    
    @GetMapping("/logout")
    public String logout() {

        return "redirect:/login";
    }
}