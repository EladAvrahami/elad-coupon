package com.ChenAndEladCoupons2.ChenAndEladCoupons2.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
@ControllerAdvice
public class AppExceptionsHandler {

    // global exceptions handler
    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<?> handleExceptions(Exception e) {
        CouponCustomExceptions errorMessage = new CouponCustomExceptions(new Date(), e.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }



}
