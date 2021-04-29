package com.company.business;

public class Order {
    private Product productDeliver;
    private double  totalCost;
    private Object  informationClient;

    public Order(Product productDeliver, double totalCost, Object informationClient) {
        this.productDeliver = productDeliver;
        this.totalCost = totalCost;
        this.informationClient = informationClient;
    }

    public Product getProductDeliver() {
        return productDeliver;
    }

    public void setProductDeliver(Product productDeliver) {
        this.productDeliver = productDeliver;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Object getInformationClient() {
        return informationClient;
    }

    public void setInformationClient(Object informationClient) {
        this.informationClient = informationClient;
    }
}
