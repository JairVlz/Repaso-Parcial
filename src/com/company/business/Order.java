package com.company.business;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List <Product> productsToDelivers= new ArrayList<>();
    private double  totalCost;
    private Client  informationClient;

    public Order(double totalCost, Client informationClient) {

        this.totalCost = totalCost;
        this.informationClient = informationClient;
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

    public void setInformationClient(Client informationClient) {
        this.informationClient = informationClient;
    }
    public void addProductToList(Product productToAgree)
    {
        productsToDelivers.add(productToAgree);
    }
}
