package com.example.tennis.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.tennis.dto.TennisMatchRequestDto;
import com.example.tennis.dto.TennisMatchResponseDto;
import com.example.tennis.entity.TennisMatch;
import com.example.tennis.exception.MatchNotFoundException;
import com.example.tennis.repository.TennisMatchRepository;
import com.example.tennis.service.TennisMatchService;

@Service
public class TennisMatchServiceImpl implements TennisMatchService {

    private final TennisMatchRepository repository;

    public TennisMatchServiceImpl(TennisMatchRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TennisMatchResponseDto> getAll() {
        return repository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public TennisMatchResponseDto getById(Long id) {
        TennisMatch match = repository.findById(id)
                .orElseThrow(() -> new MatchNotFoundException("Match not found"));
        return toResponse(match);
    }

    @Override
    public TennisMatchResponseDto create(TennisMatchRequestDto dto) {
        TennisMatch match = toEntity(dto);
        return toResponse(repository.save(match));
    }

    @Override
    public TennisMatchResponseDto update(Long id, TennisMatchRequestDto dto) {
        TennisMatch existing = repository.findById(id)
                .orElseThrow(() -> new MatchNotFoundException("Match not found"));

        existing.setPlayerOne(dto.getPlayerOne());
        existing.setPlayerTwo(dto.getPlayerTwo());
        existing.setScore(dto.getScore());
        existing.setStatus(dto.getStatus());

        return toResponse(repository.save(existing));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private TennisMatch toEntity(TennisMatchRequestDto dto) {
        return new TennisMatch(null,
                dto.getPlayerOne(),
                dto.getPlayerTwo(),
                dto.getScore(),
                dto.getStatus());
    }

    private TennisMatchResponseDto toResponse(TennisMatch match) {
        return new TennisMatchResponseDto(
                match.getId(),
                match.getPlayerOne(),
                match.getPlayerTwo(),
                match.getScore(),
                match.getStatus());
    }
}
