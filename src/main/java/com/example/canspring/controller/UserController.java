package com.example.canspring.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.canspring.dto.UserRequest;


@RestController
@RequestMapping("/api")
public class UserController {   
    @PostMapping("/users")
    public String createUser(@RequestBody UserRequest request) {
        System.out.println("Username: " + request.getUsername());
        return "User created successfully";
    }
    
}
