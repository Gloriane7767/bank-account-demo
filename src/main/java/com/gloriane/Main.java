package com.gloriane;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");
        BankAccount bankAccount1 = new BankAccount("Alice", 1000);
        System.out.println("Account Holder: " + bankAccount1.getAccountHolder());
        System.out.println("=============================");

        BankAccount bankAccount2 = new BankAccount("Bob", 500);
        System.out.println("Account Holder: " + bankAccount2.getAccountHolder());
        System.out.println("=============================");

        BankAccount bankAccount3 = new BankAccount("Charlie", 300);
        System.out.println("Account Holder: " + bankAccount3.getAccountHolder());
        System.out.println("=============================");

        BankAccount bankAccount4 = new BankAccount("Diana", 800);
        System.out.println("Account Holder: " + bankAccount4.getAccountHolder());
        System.out.println("=============================");


        Customer customer1 = new Customer("Johan Zoe", "test.test@example.com");
        System.out.println("Customer: " + customer1.getCustomer());
        System.out.println("=============================");

        Customer customer2 = new Customer("Alice Smith", "test.test@example.com");
        System.out.println("Customer: " + customer2.getCustomer());
        System.out.println("=============================");

        Customer customer3 = new Customer("Bob Johnson", "test.test@example.com");
        System.out.println("Customer: " + customer3.getCustomer());
        System.out.println("=============================");

        Customer customer4 = new Customer("Charlie Brown", "test.test@example.com");
        System.out.println("Customer: " + customer4.getCustomer());
        System.out.println("=============================");

        Student student1 = new Student("Alice Johnson", 20, "Computer Science");
        System.out.println("Student: " + student1.getName() + ", Age: " + student1.getAge() + ", Major: " + student1.getMajor());
        System.out.println("=============================");

        Student student2 = new Student("Bob Smith", 22, "Mathematics");
        System.out.println("Student: " + student2.getName() + ", Age: " + student2.getAge() + ", Major: " + student2.getMajor());
        System.out.println("=============================");

        Student student3 = new Student("Carol Davis", 19, "Biology");
        System.out.println("Student: " + student3.getName() + ", Age: " + student3.getAge() + ", Major: " + student3.getMajor());
        System.out.println("=============================");

        Student student4 = new Student("David Wilson", 21, "Engineering");
        System.out.println("Student: " + student4.getName() + ", Age: " + student4.getAge() + ", Major: " + student4.getMajor());
        System.out.println("=============================");

        Product product1 = new Product("Laptop", 999.99);
        System.out.println(product1.getProduct());
        System.out.println("=============================");

        Product product2 = new Product("Mouse", 25.50);
        System.out.println(product2.getProduct());
        System.out.println("=============================");

        Product product3 = new Product("Keyboard", 75.00);
        System.out.println(product3.getProduct());
        System.out.println("=============================");

        Product product4 = new Product("Monitor", 299.99);
        System.out.println(product4.getProduct());
        System.out.println("=============================");
    }
}


