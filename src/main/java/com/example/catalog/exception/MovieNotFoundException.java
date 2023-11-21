package com.example.catalog.exception;

public class MovieNotFoundException extends  BadRequestException{
    public MovieNotFoundException(String messageName){
        super("movieNotFoundException", new Object[]{messageName});
    }
}
