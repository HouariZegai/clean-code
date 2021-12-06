package com.houarizegai.tenniskata.service;

import com.houarizegai.tenniskata.model.dto.GameScoreDto;
import com.houarizegai.tenniskata.model.dto.InitGameDto;
import com.houarizegai.tenniskata.model.dto.RecordWinDto;

public interface TennisGameService {

    void initGame(InitGameDto initGameDto);

    void recordScore(RecordWinDto recordWinDto);

    GameScoreDto getScore();
}
