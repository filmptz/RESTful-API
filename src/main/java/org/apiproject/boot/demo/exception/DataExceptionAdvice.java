package org.apiproject.boot.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DataExceptionAdvice {
    public DataExceptionAdvice(){

    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(DataNotFoundException.class)
    String dataNotFound(DataNotFoundException e){
        return e.getMessage();
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @ExceptionHandler(DataCannotCreateException.class)
    String dataCannotCreated(DataCannotCreateException e){
        return e.getMessage();
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(INTERNAL_SERVER_ERROR.class)
    String internalServerErr(INTERNAL_SERVER_ERROR e){
        return e.getMessage();
    }

}
