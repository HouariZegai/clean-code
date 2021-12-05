package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private int firstPlayerScore;
    private int secondPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(0, "Love");
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    @Override
    public String getScore() {
        if(firstPlayerScore == secondPlayerScore) {
            return "Love All";
        }

        return SCORES.get(firstPlayerScore) + " " + SCORES.get(secondPlayerScore);
    }

    @Override
    public void firstPlayerWin() {
        firstPlayerScore++;
    }

    @Override
    public void secondPlayerWin() {
        secondPlayerScore++;
    }
}
