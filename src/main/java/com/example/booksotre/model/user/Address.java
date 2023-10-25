package com.example.booksotre.model.user;

public class Address {
    private String id;
    private String houseNumber;
    private String city;
    private String town;

    public Address() {
    }

    public Address(String id, String houseNumber, String city, String town) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.city = city;
        this.town = town;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
