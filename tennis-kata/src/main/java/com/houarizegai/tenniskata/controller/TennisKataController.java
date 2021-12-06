package com.houarizegai.tenniskata.controller;

import com.houarizegai.tenniskata.model.InitGame;
import com.houarizegai.tenniskata.service.TennisGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/tennis")
@RequiredArgsConstructor
public class TennisKataController {

    private final TennisGameService tennisGameService;

    @PostMapping("/init")
    @ResponseStatus(HttpStatus.CREATED)
    public void initGame(@Valid @RequestBody InitGame initGame) {
        tennisGameService.initGame(initGame);
    }
}
