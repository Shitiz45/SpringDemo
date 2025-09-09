package com.example.demo;

import org.springframework.stereotype.Component;

@Component("B1")
public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;

    public Book() {
        System.out.println("Book object created");
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void read() {
        System.out.println("Reading a book");
    }
}
