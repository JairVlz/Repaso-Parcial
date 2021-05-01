package com.company.business;

import java.util.Objects;

public class Client {
    private String name;
    private String direction;
    private String phoneNumber;

    public Client() {
    }

    public Client(String name, String direction, String phoneNumber) {
        this.name = name;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
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

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        if (phoneNumber.equals(client.phoneNumber))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
