package com.krishnam.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Hello World!, Welcome to Krishnam's Server";
    }
    @RequestMapping("/about")
    public String about(){
        return "Krishnam Soni is a Software Developer.";
    }
}
