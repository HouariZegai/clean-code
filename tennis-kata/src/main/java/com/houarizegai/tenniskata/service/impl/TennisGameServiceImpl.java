package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.model.InitGame;
import com.houarizegai.tenniskata.service.TennisGame;
import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private TennisGame tennisGame;

    @Override
    public void initGame(InitGame initGame) {
        tennisGame = new TennisGame(initGame.firstPlayerName(), initGame.secondPlayerName());
    }
}
