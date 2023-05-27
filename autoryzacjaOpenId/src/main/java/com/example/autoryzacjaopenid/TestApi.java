package com.example.autoryzacjaopenid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/test1")
    public String test1(){
        return "test1 dla wszystkich";
    }
    @GetMapping("/test2")
    public String test2(){
        return "test2 dla zarejestrowanych";
    }
}
