package com.demogreetingsapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demogreetingsapp.model.Greeting;
import com.demogreetingsapp.repository.GreetingRepository;

@Controller
public class GreetingController {

    private final GreetingRepository greetingRepository;

    public GreetingController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // ==============================
    // Greeting App
    // ==============================

    @GetMapping("/greeting")
    public String showGreetingPage() {

        return "greeting";
    }


    // ==============================
    // Greet Me
    // ==============================

    @PostMapping("/greet")
    public String greetMe(
            @RequestParam("name") String name,
            Model model) {

        Greeting greeting = new Greeting();

        greeting.setName(name);

        greetingRepository.save(greeting);

        model.addAttribute(
                "message",
                "Hello " + name + "!"
        );

        return "greeting";
    }


    // ==============================
    // Show All Greetings
    // ==============================

    @GetMapping("/greetings")
    public String showAllGreetings(Model model) {

        List<Greeting> greetings =
                greetingRepository.findAll();

        model.addAttribute(
                "greetings",
                greetings
        );

        return "greetings";
    }


    // ==============================
    // EDIT
    // ==============================

    @PostMapping("/edit")
    public String editGreeting(
            @RequestParam("id") Long id,
            @RequestParam("name") String name) {

        Greeting greeting =
                greetingRepository.findById(id)
                        .orElse(null);

        if (greeting != null) {

            greeting.setName(name);

            greetingRepository.save(greeting);
        }

        return "redirect:/greetings";
    }


    // ==============================
    // DELETE
    // ==============================

    @GetMapping("/delete")
    public String deleteGreeting(
            @RequestParam("id") Long id) {

        greetingRepository.deleteById(id);

        return "redirect:/greetings";
    }
}