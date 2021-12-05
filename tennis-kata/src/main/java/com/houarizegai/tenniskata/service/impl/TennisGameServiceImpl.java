package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private int firstPlayerScore;

    @Override
    public String getScore() {
        return "Love All";
    }

    @Override
    public void firstPlayerWin() {
        firstPlayerScore++;
    }
}
