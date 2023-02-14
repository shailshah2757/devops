package com.example.springapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/shail")
    public String function() {
        return "Hello World!!!";
    }
}
