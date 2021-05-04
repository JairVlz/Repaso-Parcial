package com.company.business;

public class Particular extends Client {


    public Particular (String name, String direction,String phoneNumber,String cuit)
    {
        super(name, direction, phoneNumber,cuit);

    }

    @Override
    public void mostrarEnDetalle() {
        System.out.println("Cliente:");
    }
}
