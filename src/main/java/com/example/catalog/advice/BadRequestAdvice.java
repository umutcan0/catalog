package com.example.catalog.advice;

import com.example.catalog.exception.BadRequestException;
import com.example.catalog.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class BadRequestAdvice extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {BadRequestException.class,RuntimeException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ResponseEntity<Object> badRequestAdvice(BadRequestException exception) {
        ErrorMessage errorMessage = new ErrorMessage(
                404,
                new Date(),
                exception.getMessage(),
                ""
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
