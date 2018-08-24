package com.example.TrainingPlanner.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class welcomeController {

    @RequestMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}