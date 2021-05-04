package com.company.business;

public class Company extends Client {
    private double discount;

    public Company(String name, String direction, String phoneNumber,String cuit) {
        super(name, direction, phoneNumber,cuit);
        this.discount = 15;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void mostrarEnDetalle() {

    }
}
