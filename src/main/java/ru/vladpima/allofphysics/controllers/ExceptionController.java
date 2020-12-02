package ru.vladpima.allofphysics.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vladpima.allofphysics.exception.PostNotFoundException;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = PostNotFoundException.class)
    public ResponseEntity postNotFound() {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Post not found");

    }
}
