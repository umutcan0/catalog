package com.example.catalog.exception;

public class MediaNotFoundException extends BadRequestException{
    public MediaNotFoundException(String messageName){
        super("mediaNotFoundException", new Object[]{messageName});
    }
}
