package com.example.tennis.service;

import java.util.List;

import com.example.tennis.dto.TennisMatchRequestDto;
import com.example.tennis.dto.TennisMatchResponseDto;

public interface TennisMatchService {

    List<TennisMatchResponseDto> getAll();

    TennisMatchResponseDto getById(Long id);

    TennisMatchResponseDto create(TennisMatchRequestDto dto);

    TennisMatchResponseDto update(Long id, TennisMatchRequestDto dto);

    void delete(Long id);
}
