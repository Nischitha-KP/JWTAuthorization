package com.example.JPAAuthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return "Welcome";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Admin Page";
    }
    @GetMapping("/user")
    public String user(){
        return "User Page";
    }
}
