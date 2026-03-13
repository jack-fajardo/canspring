package com.example.canspring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/snippets")
public class SnippetController {
    @GetMapping
    public String getAllSnippets() {
        System.out.println("Sample springboot jack jack");
        return "This server is awake!";
    }
}