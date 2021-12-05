package com.houarizegai.tenniskata.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class TennisGameServiceTest {

    @Test
    public void shouldReturnLoveAll() {
        TennisGameService tennisGameService = new TennisGameService();
        String score = tennisGameService.getScore();
        assertEquals("Love All", score);
    }
}