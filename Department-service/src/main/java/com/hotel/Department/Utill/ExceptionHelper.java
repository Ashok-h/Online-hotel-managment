package com.hotel.Department.Utill;

import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(basePackages = "com.hotel.Department")
public class ExceptionHelper {
	
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHelper.class);

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<Object> handleInvalidInputException(Exception ex) {
        logger.error("InternalServerError: ",ex.getMessage());
        return new ResponseEntity<Object>("InternalServerError: "+ ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
