package com.example.RestAPI_MessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController
class MyClass{
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello" ;
    }

    @GetMapping("/hello/query")
    public String greet(@RequestParam String name){
        return "Hello "+name ;
    }

    @GetMapping("/hello/param/{name}")
    public String sayName(@PathVariable String name){
        return "Hello "+name ;
    }

}