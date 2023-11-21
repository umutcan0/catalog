package com.example.catalog.exception;

public class UserNotFoundException extends BadRequestException{
    public UserNotFoundException(String messageName){
        super("userNotFoundException", new Object[]{messageName});
    }
}
