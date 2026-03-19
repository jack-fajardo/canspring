package com.example.canspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;
import com.example.canspring.repository.CategoryRepository;
import com.example.canspring.entity.Category;

@RestController
@RequestMapping("/api/snippets")
public class SnippetController {
    private final CategoryRepository repository;

    public SnippetController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Category> getAllSnippets() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Category getSnippet(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Category create(@RequestBody Category input) {
        return repository.save(input);
    }
}