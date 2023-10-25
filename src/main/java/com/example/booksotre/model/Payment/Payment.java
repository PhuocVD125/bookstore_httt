package com.example.booksotre.model.Payment;

public class Payment {
    private String id;
    private String type;
    private String status;
    public Payment() {
    }
    public Payment(String id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }
}
