package com.hotel.Reservationservice.util;

import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

//@ControllerAdvice(annotations = RestController.class)
@ControllerAdvice(basePackages = "com.hotel.Reservationservice")
public class ExceptionHelper {
	
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHelper.class);

    @ExceptionHandler(value = { ResourceNotFoundException.class })
    public ResponseEntity<Object> handleInvalidInputException(ResourceNotFoundException ex) {
        logger.error("Invalid Input Exception: ",ex.getMessage());
        return new ResponseEntity<Object>("Invalid Input Exception: "+ ex.getMessage(),HttpStatus.BAD_REQUEST);
    }

}
