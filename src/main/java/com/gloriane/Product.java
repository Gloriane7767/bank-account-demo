package com.gloriane;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    public String getProduct() {
        if ( name != null && !name.isEmpty() && price > 0 ) {
            return "Product: " + name + ", Price: $" + price;
        }
        return "Invalid product";
    }
}