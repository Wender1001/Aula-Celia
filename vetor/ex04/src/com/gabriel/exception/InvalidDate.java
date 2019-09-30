package com.gabriel.exception;

public class InvalidDate extends RuntimeException {
    private String msg;

    public InvalidDate(String msg){
        super(msg);
    }
}
