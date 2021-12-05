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
        firstPlayerWins(1);
        String score = tennisGameService.getScore();

        assertEquals("Fifteen Love", score);
    }

    @Test
    public void firstPlayerWinsTwoBall() {
        firstPlayerWins(2);
        String score = tennisGameService.getScore();

        assertEquals("Thirty Love", score);
    }

    @Test
    public void firstPlayerWinsThreeBall() {
        firstPlayerWins(3);
        String score = tennisGameService.getScore();

        assertEquals("Forty Love", score);
    }

    @Test
    private void secondPlayerWinsFirstBall() {
        tennisGameService.secondPlayerWin();
    }

    private void firstPlayerWins(int times) {
        for(int i = 0; i < times; i++) {
            tennisGameService.firstPlayerWin();
        }
    }
}