package com.houarizegai.tenniskata.service;

import com.houarizegai.tenniskata.service.impl.TennisGameServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class TennisGameServiceTest {

    private TennisGameService tennisGameService;

    @BeforeEach
    public void setup() {
        tennisGameService = new TennisGameServiceImpl();
    }

    @Test
    public void shouldReturnLoveAll() {
        String score = tennisGameService.getScore();
        assertEquals("Love All", score);
    }

    @Test
    public void firstPlayerWinsFirstBall() {
        tennisGameService.firstPlayerWin();
        String score = tennisGameService.getScore();

        assertEquals("Fifteen Love", score);
    }

    @Test
    public void firstPlayerWinsTwoBall() {
        tennisGameService.firstPlayerWin();
        tennisGameService.firstPlayerWin();
        String score = tennisGameService.getScore();

        assertEquals("Thirty Love", score);
    }
}