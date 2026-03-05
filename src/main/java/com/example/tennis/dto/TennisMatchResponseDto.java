package com.example.tennis.dto;

public class TennisMatchResponseDto {

    private Long id;
    private String playerOne;
    private String playerTwo;
    private String score;
    private String status;

    public TennisMatchResponseDto() {
    }

    public TennisMatchResponseDto(Long id, String playerOne, String playerTwo, String score, String status) {
        this.id = id;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.score = score;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public String getScore() {
        return score;
    }

    public String getStatus() {
        return status;
    }
}
