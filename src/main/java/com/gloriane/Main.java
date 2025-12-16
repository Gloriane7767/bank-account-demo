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

    }
}