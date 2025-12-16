package com.gloriane;

import java.util.UUID;

public class Customer {
    private  int id;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if(email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }
    
    public int setId() {
        return UUID.randomUUID().toString().substring(0,8).hashCode();
    }

    public String getCustomer() {
        if(name == null || name.trim().isEmpty() || email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid customer information");
        }
        return this.name + ", Email: " + this.email;
    }
}