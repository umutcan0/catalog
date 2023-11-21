package com.example.catalog.exception;

public class BookNotFoundException extends BadRequestException{
    public BookNotFoundException(String messageName){
        super("bookNotFoundException", new Object[]{messageName});
    }
}
