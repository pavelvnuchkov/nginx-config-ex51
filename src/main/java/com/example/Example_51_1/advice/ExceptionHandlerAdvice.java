package com.example.Example_51_1.advice;


import com.example.Example_51_1.exception.InvalidCredentials;
import com.example.Example_51_1.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handlerInvalidCredit(InvalidCredentials e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handlerUnauthorizedUser(UnauthorizedUser e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
