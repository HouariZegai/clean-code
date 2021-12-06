package com.houarizegai.tenniskata.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.toList());

        ApiError body = new ApiError(status, ZonedDateTime.now(), errors);

        return new ResponseEntity<>(body, headers, status);
    }

    @ExceptionHandler(value = {GameNotInitException.class})
    public ResponseEntity<ApiError> handleGameNotInitException(GameNotInitException ex) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ApiError body = new ApiError(status, ZonedDateTime.now(), Collections.singletonList(ex.getMessage()));

        return new ResponseEntity<>(body, status);
    }
}
