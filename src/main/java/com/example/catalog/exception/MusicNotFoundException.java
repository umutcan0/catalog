package com.example.catalog.exception;

public class MusicNotFoundException extends BadRequestException{
    public MusicNotFoundException(String messageName){
        super("musicNotFoundException", new Object[]{messageName});
    }
}
