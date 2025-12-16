package com.gloriane;

import java.util.UUID;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = UUID.randomUUID().toString().substring(0,8).hashCode();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int setId() {
        return UUID.randomUUID().toString().substring(0,8).hashCode();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getProduct() {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid product information");
        }
        return "ID: " + this.id + ", " + this.name + ", Price: $" + this.price;
    }
}