package com.houarizegai.tenniskata.service.impl;

import com.houarizegai.tenniskata.exception.GameNotInitException;
import com.houarizegai.tenniskata.model.dto.GameScoreDto;
import com.houarizegai.tenniskata.model.dto.InitGameDto;
import com.houarizegai.tenniskata.model.dto.RecordWinDto;
import com.houarizegai.tenniskata.service.TennisGame;
import com.houarizegai.tenniskata.service.TennisGameService;
import org.springframework.stereotype.Service;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private TennisGame tennisGame;

    @Override
    public void initGame(InitGameDto initGameDto) {
        tennisGame = new TennisGame(initGameDto.firstPlayerName(), initGameDto.secondPlayerName());
    }

    @Override
    public void recordScore(RecordWinDto recordWinDto) {
        assertGameInitialized();

        for (int i = 0; i < recordWinDto.firstPlayerWin(); i++) {
            tennisGame.firstPlayerWin();
        }
        for (int i = 0; i < recordWinDto.secondPlayerWin(); i++) {
            tennisGame.secondPlayerWin();
        }
    }

    @Override
    public GameScoreDto getScore() {
        assertGameInitialized();

        return new GameScoreDto(tennisGame.getFirstPlayer(), tennisGame.getSecondPlayer(), tennisGame.getScore());
    }

    private void assertGameInitialized() {
        if (tennisGame == null) {
            throw new GameNotInitException("Game is not initialized");
        }
    }
}
