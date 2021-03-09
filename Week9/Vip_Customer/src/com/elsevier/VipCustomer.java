package com.elsevier;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Vincenzo Florio", 33000.50, "vincenzoflorio31@gmail.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "defaultemail@gmail.com");
        System.out.println("2 value constructor called");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
