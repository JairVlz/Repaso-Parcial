package com.company;
import com.company.business.SalesCompany;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner theScanner= new Scanner(System.in);

    SalesCompany grupoNucleo= new SalesCompany();

    String nameOfCustomer;

    System.out.println("Ingrese el nombre:");

    nameOfCustomer=theScanner.next();

    System.out.println("Ingrese el numero de telefono:");

    String phoneNumber = theScanner.next();

    System.out.println("Ingrese la direccion:");

    String direction= theScanner.next();


    grupoNucleo.createCustomerAndAdd(nameOfCustomer,phoneNumber,direction);

    System.out.println("Ingrese el nombre:");

    String nameOfCompany= theScanner.next();

    System.out.println("Ingrese el numero de telefono:");

    String phoneNumberOfCompany = theScanner.next();

    System.out.println("Ingrese la direccion:");

    String directionOfComapany= theScanner.next();

    grupoNucleo.createCompanies(nameOfCompany,directionOfComapany,phoneNumberOfCompany);

    System.out.println("Ingrese el nombre:");

    String nameOfProduct= theScanner.next();

    System.out.println("Ingrese el precio:");

    double priceOfProduct= theScanner.nextFloat();

    System.out.println("Ingrese el stock del producto");

    int stockOfProduct= theScanner.nextInt();

    grupoNucleo.createProducctAndAdd(priceOfProduct,nameOfProduct,stockOfProduct);

    System.out.println("Ingrese el nombre del producto");

    String nameOfProductToSell= theScanner.next();

    System.out.println("Ingrese el nombre del cliente:");

    String clientToBill= theScanner.next();

    grupoNucleo.generateOrder(nameOfProductToSell,clientToBill);
    }

}
