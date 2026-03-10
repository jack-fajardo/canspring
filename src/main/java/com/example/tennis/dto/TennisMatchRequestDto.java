package com.example.tennis.dto;

public class TennisMatchRequestDto {

    private String playerOne;
    private String playerTwo;
    private String status;
    private String score;

    public TennisMatchRequestDto() {
    }

    public String getPlayerOne() {
        return this.playerOne;
    }

    public String getPlayerTwo() {
        return this.playerTwo;
    }

    public String getStatus() {
        return this.status;
    }

    public String getScore() {
        return this.score;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
