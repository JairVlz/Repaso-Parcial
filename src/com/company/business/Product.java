package com.company.business;

public class Product {
    private double price;
    private String name;
    private int stock;

    public Product(){}

    public Product(double price, String name,int stock)
    {
        this.price=price;
        this.stock=stock;
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
