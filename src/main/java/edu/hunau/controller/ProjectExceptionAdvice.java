package edu.hunau.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler({/*Insert Exception Type Here...*/})
    public void doException(Exception e){

    }
}
