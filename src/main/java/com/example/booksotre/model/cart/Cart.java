package com.example.booksotre.model.cart;


import com.example.booksotre.model.Item.Item;

import java.util.Date;
import java.util.List;

public class Cart {
    private String id;
    private Date createDate;
    private List<Item> ItemList;
    // code lai total price
    public Cart() {
    }

    public Cart(String id, Date createDate, List<Item> ItemList) {
        this.id = id;
        this.createDate = createDate;
        this.ItemList = ItemList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Item> getItemList() {
        return ItemList;
    }

    public void setItemList(List<Item> ItemList) {
        this.ItemList = ItemList;
    }
}
