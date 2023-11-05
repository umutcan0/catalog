package com.example.catalog.services;

import com.example.catalog.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public Book getBook(Long id);
    public List<Book> getAllBook();
    public Book createBook(Book book);
    public Book updateBook(Long id, Book book);
    public void deleteBook(Long id);


}
