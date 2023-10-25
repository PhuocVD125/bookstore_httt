package com.example.booksotre.model.book;

public class Author {
    private String id;
    private String name;
    private String des;
    public Author() {
    }
    public Author(String id, String name, String des) {
        this.id = id;
        this.name = name;
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
    public String getdes() {
        return des;
    }
    public void setdes(String des) {
        this.des = des;
    }
}
