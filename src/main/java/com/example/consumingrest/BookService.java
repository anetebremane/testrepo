package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
@Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public Optional<Book> getOne(int id){
        return bookRepository.findById(id);
    }
}
