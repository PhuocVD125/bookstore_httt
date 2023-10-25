package com.example.booksotre.model.user;


public class User {
    private String id;
    private Name name;
    private Account account;
    private Address address;
    private String phone;
    private String dob;
    private String email;
    public User() {
    }

    public User(String id, Name name, Account account, Address address, String phone, String email, String dob) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
