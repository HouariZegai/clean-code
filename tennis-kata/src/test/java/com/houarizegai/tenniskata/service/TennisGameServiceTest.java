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

    private final String firstPlayerName = "Houari";
    private final String secondPlayerName = "Mohamed";

    @BeforeEach
    public void setup() {
        tennisGameService = new TennisGameServiceImpl(firstPlayerName, secondPlayerName);
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

    @Test
    public void secondPlayerWinsThreeBall() {
        playersWins(0, 3);
        String score = tennisGameService.getScore();

        assertEquals("Love Forty", score);
    }

    @Test
    public void bothPlayersWinsOneBall() {
        playersWins(1, 1);
        String score = tennisGameService.getScore();

        assertEquals("Fifteen All", score);
    }

    @Test
    public void bothPlayersWinsTwoBall() {
        playersWins(2, 2);
        String score = tennisGameService.getScore();

        assertEquals("Thirty All", score);
    }

    @Test
    public void playersAreDeuce3x3() {
        playersWins(3, 3);
        String score = tennisGameService.getScore();

        assertEquals("Deuce", score);
    }

    @Test
    public void playersAreDeuce4x4() {
        playersWins(4, 4);
        String score = tennisGameService.getScore();

        assertEquals("Deuce", score);
    }

    @Test
    public void firstPlayerAdv() {
        playersWins(5, 4);
        String score = tennisGameService.getScore();

        assertEquals(firstPlayerName + " Advantage", score);
    }

    @Test
    public void secondPlayerAdv() {
        playersWins(3, 4);
        String score = tennisGameService.getScore();

        assertEquals(secondPlayerName + " Advantage", score);
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