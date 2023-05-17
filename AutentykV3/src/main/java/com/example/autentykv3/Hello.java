package com.example.autentykv3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
    @GetMapping("/hello")
    public String Welcome(){
        return "Hello";
    }
    @GetMapping("/helloAdmin")
    public String WelcomeAdmin(){
        return "Hello for ADMINS";
    }
}
