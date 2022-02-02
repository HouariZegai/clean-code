package com.houarizegai.tenniskata.exception;

public class GameNotInitException extends RuntimeException {

    private String message;

    public GameNotInitException(String message) {
        super(message);
        this.message = message;
    }
}
