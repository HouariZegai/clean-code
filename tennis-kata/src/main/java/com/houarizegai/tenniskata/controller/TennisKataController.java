package com.houarizegai.tenniskata.controller;

import com.houarizegai.tenniskata.model.dto.GameScoreDto;
import com.houarizegai.tenniskata.model.dto.InitGameDto;
import com.houarizegai.tenniskata.model.dto.RecordWinDto;
import com.houarizegai.tenniskata.service.TennisGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/tennis")
@RequiredArgsConstructor
public class TennisKataController {

    private final TennisGameService tennisGameService;

    @PostMapping("/init")
    @ResponseStatus(HttpStatus.CREATED)
    public void initGame(@Valid @RequestBody InitGameDto initGameDto) {
        tennisGameService.initGame(initGameDto);
    }

    @PutMapping("/record")
    public ResponseEntity<GameScoreDto> recordWin(@Valid @RequestBody RecordWinDto recordWinDto) {
        tennisGameService.recordScore(recordWinDto);

        return ResponseEntity.accepted().body(tennisGameService.getScore());
    }

    @GetMapping("/score")
    public ResponseEntity<GameScoreDto> getScore() {
        return ResponseEntity.ok(tennisGameService.getScore());
    }
}
