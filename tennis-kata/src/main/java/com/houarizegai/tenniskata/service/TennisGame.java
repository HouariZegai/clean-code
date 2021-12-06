package com.houarizegai.tenniskata.service;

import com.houarizegai.tenniskata.model.Player;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private final Player firstPlayer;
    private final Player secondPlayer;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(0, "Love");
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public TennisGame(String firstPlayerName, String secondPlayerName) {
        firstPlayer = Player.builder().name(firstPlayerName).build();
        secondPlayer = Player.builder().name(secondPlayerName).build();
    }

    public String getScore() {
        if(isDeuce()) {
            return "Deuce";
        }

        if(firstPlayer.getScore() == secondPlayer.getScore()) {
            return SCORES.get(firstPlayer.getScore()) + " All";
        }

        String highestPlayerName = getHighestPlayer();

        if(firstPlayer.getScore() > 3 || secondPlayer.getScore() > 3) {
            if(hasAdvantage()) {
                return highestPlayerName + " Advantage";
            }

            if(hasWinner()) {
                return highestPlayerName + " Win";
            }
        }

        return SCORES.get(firstPlayer.getScore()) + " " + SCORES.get(secondPlayer.getScore());
    }

    public void firstPlayerWin() {
        firstPlayer.setScore(firstPlayer.getScore() + 1);
    }

    public void secondPlayerWin() {
        secondPlayer.setScore(secondPlayer.getScore() + 1);
    }

    private boolean isDeuce() {
        return firstPlayer.getScore() == secondPlayer.getScore() && firstPlayer.getScore() >= 3;
    }

    private boolean hasAdvantage() {
        return Math.abs(firstPlayer.getScore() - secondPlayer.getScore()) == 1;
    }

    private boolean hasWinner() {
        return Math.abs(firstPlayer.getScore() - secondPlayer.getScore()) == 2;
    }

    private String getHighestPlayer() {
        return firstPlayer.getScore() > secondPlayer.getScore() ? firstPlayer.getName() : secondPlayer.getName();
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }
}
