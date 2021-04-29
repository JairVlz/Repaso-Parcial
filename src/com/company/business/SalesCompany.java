package com.company.business;

import javafx.beans.binding.ObjectExpression;

import java.awt.print.PrinterAbortException;
import java.util.ArrayList;
import java.util.List;

public class SalesCompany {
    private List <PrivateCustomer> listPrivateCustomers= new ArrayList<>();
    private List <Companies> listCompanies= new ArrayList<>();
    private List <Order> listOrders= new ArrayList<>();
    private List <Product> listProducts= new ArrayList<>();



    public void createCustomerAndAdd(String name, String phoneNumber , String direction)
    {
        PrivateCustomer customerToAdd=new PrivateCustomer(name, direction, phoneNumber);

        listPrivateCustomers.add(customerToAdd);
    }
    public void createProducctAndAdd(double price , String name , int stock)
    {
        Product productToAdd=new Product(price, name, stock);

        listProducts.add(productToAdd);
    }
    public void createCompanies (String name , String direction,String phoneNumber)
    {
        Companies companyToAdd=new Companies (name,direction,phoneNumber);

        listCompanies.add(companyToAdd);


    }

    public boolean confirmStock(String nameOfProduct)
    {
        for (Product aux:listProducts)
        {
            if (aux.getName()==nameOfProduct&&aux.getStock()>0)
                return true;
        }

        return false;
    }
    public int findProduct(String name)
    {
        for(Product aux:listProducts)
        {
            if (aux.getName()==name&&aux.getStock()>0)
                return listProducts.indexOf(aux);
        }
        return -1;
    }
    public double calculateDistance(double price){
        return price+300;
    }

    public int findClientPrivae(String nameOfClient)
    {


        for (PrivateCustomer auxOfClient:listPrivateCustomers)
        {
            if (auxOfClient.getName()==nameOfClient)
            {
                return listPrivateCustomers.indexOf(auxOfClient);
            }
        }
        return -1;
    }
    public int findClientEmpresary(String nameOfClient)
    {
        for (Companies aux:listCompanies)
        {
            if (aux.getNameFantasy()==nameOfClient)
            {

                return listProducts.indexOf(aux);
            }
        }
        return -1;
    }

    public void generateOrder(String nameOfProduct,String nameOfClient){
        int posOfProduct;
        double totalPrice=500;
        int posInList;
        posInList=findClientPrivae(nameOfClient);
        if (posInList>=0)
        {

        posOfProduct=findProduct(nameOfProduct);
        totalPrice=calculateDistance(listProducts.get(posOfProduct).getPrice());
        if (posOfProduct>-1)
        {
            listOrders.add(new Order(listProducts.get(posOfProduct),totalPrice,listPrivateCustomers.get(posInList)));
        }
        }else if(findClientEmpresary(nameOfClient)>=0)
        {

            posOfProduct=findProduct(nameOfProduct);
            totalPrice=(calculateDistance(listProducts.get(posOfProduct).getPrice()))*15/100;
            if (posOfProduct>-1)
            {
                listOrders.add(new Order(listProducts.get(posOfProduct),totalPrice, listCompanies.get(posInList)));
            }
        }
    }

}
