package com.star.online_trading.config;

import com.star.online_trading.exception.UserCustomException;
import com.star.online_trading.model.response.ApiExceptionErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ApiExceptionErrorResponse apiExceptionErrorResponse = new ApiExceptionErrorResponse(
                HttpStatus.BAD_REQUEST.value(), ex.getMessage()
        );
        return ResponseEntity.badRequest().body(apiExceptionErrorResponse);
    }

    @ExceptionHandler(UserCustomException.class)
    public ResponseEntity<?> handleUserCustomException() {
        ApiExceptionErrorResponse apiExceptionErrorResponse = new ApiExceptionErrorResponse(
                HttpStatus.BAD_REQUEST.value(), "user is exist"
        );
        return ResponseEntity.badRequest().body(apiExceptionErrorResponse);
    }
}
