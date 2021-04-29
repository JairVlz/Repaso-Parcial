package com.company.business;

public class PrivateCustomer {
    private String name;
    private String direction;
    private String phoneNumber;

    public PrivateCustomer(){}

    public PrivateCustomer(String name , String direction, String phoneNumber){
        this.name=name;
        this.direction=direction;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
