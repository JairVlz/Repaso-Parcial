package com.company.business;

import java.util.Objects;

public abstract class Client {
    private String name;
    private String direction;
    private String phoneNumber;
    private String cuit;


    public Client(String name, String direction, String phoneNumber,String cuit) {
        this.name = name;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
        this.cuit=cuit;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public abstract void mostrarEnDetalle ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        if (cuit.equals(client.cuit))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
