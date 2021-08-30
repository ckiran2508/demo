package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getMessage(){
        return "Hello World Good Morning";
        //This is a comment from remote
    }
}
