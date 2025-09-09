package com.example.demo;

import org.springframework.stereotype.Component;

@Component("B1")
public class Book {
    public void read() {
        System.out.println("Reading a book");
    }
}
