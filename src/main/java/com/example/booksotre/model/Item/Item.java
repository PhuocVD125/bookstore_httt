package com.example.booksotre.model.Item;


import com.example.booksotre.model.book.Book;

public class Item {
    private String id;
    private int quantity;
    private Book book;
    public Item() {
    }

    public Item(String id, int quantity, float totalPrice, Book book) {
        this.id = id;
        this.quantity = quantity;
        this.book = book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public float totalItemPrice() {
        return this.book.getPrice()*this.quantity;
    }
}
