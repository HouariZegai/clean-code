package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private int firstPlayerScore;

    @Override
    public String getScore() {
        if(firstPlayerScore == 1) {
            return "Fifteen Love";
        }

        return "Love All";
    }

    @Override
    public void firstPlayerWin() {
        firstPlayerScore++;
    }
}
