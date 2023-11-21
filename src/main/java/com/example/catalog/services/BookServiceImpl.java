package com.example.catalog.services;

import com.example.catalog.entities.Book;
import com.example.catalog.exception.BookNotFoundException;
import com.example.catalog.repositories.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBook(Long id){
        return bookRepository.findById(id).orElseThrow(() ->{
            throw new BookNotFoundException("Book mevcut değil");
        });
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book){
        Book existingBook = bookRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Kullanıcı bulunamadı"));

        existingBook.setName(book.getName());
        existingBook.setWriter(book.getWriter());

        return bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
