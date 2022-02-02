package com.houarizegai.tenniskata.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.List;

public record ApiError (HttpStatus status, ZonedDateTime timestamp, List<String> errors){
}
