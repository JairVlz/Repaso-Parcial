package com.company.business;

public class Company extends Client {
    private double discount;

    public Company() {
    }

    public Company(String name, String direction, String phoneNumber) {
        super(name, direction, phoneNumber);
        this.discount = 15;
    }

    public double getDiscount() {
        return discount;
    }
}
