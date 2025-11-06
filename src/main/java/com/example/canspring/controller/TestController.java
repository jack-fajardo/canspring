package com.example.canspring.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.canspring.model.TestEntity;
import com.example.canspring.repository.TestRepository;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping
    public List<TestEntity> getAll() {
        return testRepository.findAll();
    }

    @PostMapping
    public TestEntity create(@RequestBody TestEntity entity) {
        return testRepository.save(entity);
    }
}
