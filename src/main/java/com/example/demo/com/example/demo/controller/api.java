package com.example.demo.com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {
    @GetMapping(value="/welcome")
    public String welcome(){
        return "hello everyone!";
    }
}
