package com.gloriane;

import java.util.UUID;

public class Student {
    private int id;
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.id = generateId();
        setName(name);
        setAge(age);
        setMajor(major);
    }

    private int generateId() {
        return Math.abs(UUID.randomUUID().toString().substring(0,8).hashCode());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
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

    public void setAge(int age) {
        if(age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public void setMajor(String major) {
        if(major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Major cannot be null or empty");
        }
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", major='" + major + "'}";
    }

    public Student getStudent() {
        if (name == null || name.trim().isEmpty() || major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid student information");
        }
        return this;
    }
}

