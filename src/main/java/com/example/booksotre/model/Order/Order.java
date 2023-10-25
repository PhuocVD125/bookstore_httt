package com.example.booksotre.model.Order;


import com.example.booksotre.model.Item.Item;
import com.example.booksotre.model.Payment.Payment;
import com.example.booksotre.model.Shipment.Shipment;
import com.example.booksotre.model.user.Customer;

import java.util.Date;
import java.util.List;

public class Order {
    private String status;
    private Date date;
    private Payment payment;
    private Shipment shipment;
    private List<Item> ItemList;

    private Customer customer;


    public Order(Customer customer, Item item, String status, Date date, Payment payment, Shipment shipment) {
        this.customer = customer;
        this.status = status;
        this.date = date;
        this.payment = payment;
        this.shipment = shipment;
    }

    public float getTotalPrice(List<Item> ItemList) {
        float totalPrice = 0;
        for( Item Item: ItemList) {
            totalPrice += Item.totalItemPrice();
        }
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public List<Item> getItemList() {
        return ItemList;
    }

    public void setItemList(List<Item> itemList) {
        ItemList = itemList;
    }
}
