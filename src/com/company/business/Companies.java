package com.company.business;

public class Companies {
    private String nameFantasy;
    private String direction;
    private String phoneNumber;

    public Companies(String nameFantasy, String direction, String phoneNumber) {
        this.nameFantasy = nameFantasy;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
    }

    public String getNameFantasy() {
        return nameFantasy;
    }

    public void setNameFantasy(String nameFantasy) {
        this.nameFantasy = nameFantasy;
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
