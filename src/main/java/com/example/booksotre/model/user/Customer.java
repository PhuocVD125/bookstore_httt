package com.example.booksotre.model.user;

import java.util.Date;

public class Customer extends User{
    private Date created;

    public Customer(Date created) {
        this.created = created;
    }

    public Customer(String id, Name name, Account account, Address address, String phone, String email, String dob, Date created) {
        super(id, name, account, address, phone, email, dob);
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
