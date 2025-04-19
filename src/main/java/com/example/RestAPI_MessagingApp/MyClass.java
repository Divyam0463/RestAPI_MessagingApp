package com.example.RestAPI_MessagingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyClass{
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello" ;
    }
}