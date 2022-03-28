package com.example.consumingrest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//creating RestController
@RestController
public class HelloWorldController {
    @Autowired
    BookService service;
    private static Logger logger = LogManager.getLogger(HelloWorldController.class);

    @GetMapping("/")
    public int hello(@RequestParam int number){
        int value = -1;
        try {
            throw new Exception();
        }catch(Exception e){
            logger.error(e);
        }finally {
            logger.info("thats illegal");
        }
        return value;

        //in url http://localhost:8080/?number=8
        //try:
        //throw: throws info at any circumstance
        //catch: will catch error if there will be error
        //finally: throws info at any circumstance
        // go to http://localhost:8080/?name=anete and boom, you have a website
        //in terminal we see date, which class is running, logger info
    }
    //create obj. that gets books from db
    @GetMapping("/book")
    public List<Book> getBook(){
        return service.getAllBooks();
    }
    //create obj. that posts books in db
    @PostMapping("/book")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
    //create obj. that gets id
    @GetMapping("/book/{id}")
    public Book getOne(@PathVariable int id){
        return service.getOne(id).get();

        //in postman: url "localhost:8080/book"- db
        //"localhost:8080/book/1" - one obj
    }
}
