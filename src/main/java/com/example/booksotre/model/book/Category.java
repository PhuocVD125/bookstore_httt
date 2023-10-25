package com.example.booksotre.model.book;

import java.util.List;

public class Category {
    private String id;
    private String name;
    private String des;
    private List<Book> books;

    public Category() {
    }

    public Category(String id, String name, List<Book> books, String des) {
        this.id = id;
        this.name = name;
        this.books = books;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
