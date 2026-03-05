package com.example.tennis.entity;

public class TennisMatch {

    private Long id;
    private String playerOne;
    private String playerTwo;
    private String score;
    private String status;

    public TennisMatch() {
    }

    public TennisMatch(Long id, String playerOne, String playerTwo, String score, String status) {
        this.id = id;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.score = score;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
