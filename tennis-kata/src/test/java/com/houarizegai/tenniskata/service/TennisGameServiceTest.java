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
        playersWins(1, 0);
        String score = tennisGameService.getScore();

        assertEquals("Fifteen Love", score);
    }

    @Test
    public void firstPlayerWinsTwoBall() {
        playersWins(2, 0);
        String score = tennisGameService.getScore();

        assertEquals("Thirty Love", score);
    }

    @Test
    public void firstPlayerWinsThreeBall() {
        playersWins(3, 0);
        String score = tennisGameService.getScore();

        assertEquals("Forty Love", score);
    }

    @Test
    public void secondPlayerWinsFirstBall() {
        playersWins(0, 1);
        String score = tennisGameService.getScore();

        assertEquals("Love Fifteen", score);
    }

    @Test
    public void secondPlayerWinsTwoBall() {
        playersWins(0, 2);
        String score = tennisGameService.getScore();

        assertEquals("Love Thirty", score);
    }

    private void playersWins(int firstPlayerTimes, int secondPlayerTimes) {
        for(int i = 0; i < firstPlayerTimes; i++) {
            tennisGameService.firstPlayerWin();
        }

        for(int i = 0; i < secondPlayerTimes; i++) {
            tennisGameService.secondPlayerWin();
        }
    }
}