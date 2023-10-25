package com.example.booksotre.model.Shipment;

import java.util.Date;

public class Shipment {
    private String id;
    private float shipFee;
    private Date shipDate;
    private String method;
    public Shipment() {
    }

    public Shipment(String id, float shipFee, Date shipDate, String method) {
        this.id = id;
        this.shipFee = shipFee;
        this.shipDate = shipDate;
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getShipFee() {
        return shipFee;
    }

    public void setShipFee(float shipFee) {
        this.shipFee = shipFee;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }
}
