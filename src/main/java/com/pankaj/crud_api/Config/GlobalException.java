package com.pankaj.crud_api.Config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pankaj.crud_api.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

    // Handle specific exception
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex) {
        ErrorResponse er = new ErrorResponse(ex.getMessage(), 400);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
    }

    // Handle general exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Something went wrong: " + ex.getMessage());
    }

}
