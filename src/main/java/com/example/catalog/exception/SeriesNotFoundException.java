package com.example.catalog.exception;

public class SeriesNotFoundException extends BadRequestException{
    public SeriesNotFoundException(String messageName){
        super("seriesNotFoundException", new Object[]{messageName});
    }
}
