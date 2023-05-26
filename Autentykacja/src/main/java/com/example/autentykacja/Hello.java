package com.example.autentykacja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String HelloEveryone(){
        return "Hello";
    }
    @GetMapping("/helloAdmin")
    public String HelloAdmin(){
        return "Hello Administators";
    }
}
