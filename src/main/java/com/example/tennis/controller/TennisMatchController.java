package com.example.tennis.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tennis.dto.TennisMatchRequestDto;
import com.example.tennis.dto.TennisMatchResponseDto;
import com.example.tennis.service.TennisMatchService;

@RestController
@RequestMapping("/matches")
public class TennisMatchController {

    private final TennisMatchService service;

    public TennisMatchController(TennisMatchService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TennisMatchResponseDto>> getAllMatches() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TennisMatchResponseDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<TennisMatchResponseDto> create(@RequestBody TennisMatchRequestDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TennisMatchResponseDto> update(@RequestBody TennisMatchRequestDto dto, @PathVariable Long id) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Operation Successful");
    }
}
