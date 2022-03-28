package com.example.consumingrest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //mazākā vienība, ko glabā db
public class Book {
    @Id  //as primary key
    @GeneratedValue(strategy= GenerationType.AUTO)  //generating id

    private int id;
    private String name;
    private int year;
    public Book(){

    }

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }
//write getters and setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
