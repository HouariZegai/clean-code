package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.exception.GameNotInitializedException;
import com.houarizegai.tenniskata.model.dto.GameScoreDto;
import com.houarizegai.tenniskata.model.dto.InitGameDto;
import com.houarizegai.tenniskata.model.dto.RecordWinDto;
import com.houarizegai.tenniskata.service.TennisGame;
import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private TennisGame tennisGame;

    @Override
    public void initGame(InitGameDto initGameDto) {
        tennisGame = new TennisGame(initGameDto.firstPlayerName(), initGameDto.secondPlayerName());
    }

    @Override
    public void recordScore(RecordWinDto recordWinDto) {
        for (int i = 0; i < recordWinDto.firstPlayerWin(); i++) {
            tennisGame.firstPlayerWin();
        }
        for (int i = 0; i < recordWinDto.secondPlayerWin(); i++) {
            tennisGame.secondPlayerWin();
        }
    }

    @Override
    public GameScoreDto getScore() {
        TennisGame tennisGame = Optional.ofNullable(this.tennisGame)
                .orElseThrow(GameNotInitializedException::new);

        return new GameScoreDto(tennisGame.getFirstPlayer(), tennisGame.getSecondPlayer(), tennisGame.getScore());
    }
}
