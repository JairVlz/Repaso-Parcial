package com.company;

import com.company.business.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);

        double promedy=0;

        boolean confirmation;


        SalesCompany grupoNucleo = new SalesCompany();

        Company firstClient= new Company("Jorge","soler 2890","2234551674","30-45602131-5");

        Particular secondClient= new Particular("Marcelo","triunvirato 3056","2234551675","20-45622131-5");

        Product firstProducct=new Product(22000,"GTX 1660",10);

        Product secondProducct=new Product(30000,"RTX 2080",20);

        confirmation=grupoNucleo.agreeClient(firstClient);

        confirmationOfAgree(confirmation);

        confirmation=grupoNucleo.agreeClient(secondClient);

        confirmation=grupoNucleo.agreeProduct(firstProducct);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeProduct(secondProducct);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeOrder("30-45602131-5","GTX 1660",5);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeOrder("30-45602131-5","RTX 2080",5);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeOrder("30-45602131-5","GTX 1660",5);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeOrder("20-45622131-5","RTX 2080",5);
        confirmationOfAgree(confirmation);
        confirmation=grupoNucleo.agreeOrder("20-45622131-5","GTX 1660",5);
        confirmationOfAgree(confirmation);
        promedy=grupoNucleo.calculatePromedy();
        System.out.println("Promedy:"+promedy);

    }
   static void confirmationOfAgree(boolean confirmation)
    {
        if (confirmation==true)
            System.out.println("El pedido fue realizado exitosamente");
        else
            System.out.println("El pedido no fue procesado correctamente , intente de nuevo");
    }
}



