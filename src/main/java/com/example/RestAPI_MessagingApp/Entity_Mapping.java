package com.example.RestAPI_MessagingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EntityMapping{

    @PostMapping("/hello/post")
    public String helloWithBody(@RequestBody Entity entity){
        return "Hello from "+ entity.getFirstName() +" "+entity.getLastName();
    }

}