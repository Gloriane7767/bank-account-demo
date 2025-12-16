package com.gloriane;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 25.50);
        Product product3 = new Product("Keyboard", 75.00);
        Product product4 = new Product("Monitor", 299.99);

        System.out.println(product1.getProduct());
        System.out.println(product2.getProduct());
        System.out.println(product3.getProduct());
        System.out.println(product4.getProduct());
    }
}