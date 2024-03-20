package com.qa.miniproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cookie {
    @Id
    @GeneratedValue
    private Integer id;
    private String type;
    private int quantity;
    private String size;




    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSize() {
        return size;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
