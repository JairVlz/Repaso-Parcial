package com.company.business;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.beans.binding.ObjectExpression;

import javax.sound.midi.SysexMessage;
import java.awt.print.PrinterAbortException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesCompany {
    private final Set<Client> listCustomers = new HashSet<>();
    private final List<Order> listOrders = new ArrayList<>();
    private final List<Product> listProducts = new ArrayList<>();


    public SalesCompany() {
    }

    public boolean agreeClient(Client clientToAgree) {
        return listCustomers.add(clientToAgree);

    }

    public boolean agreeProduct(Product productToAgree) {
        return listProducts.add(productToAgree);
    }

    public double calculateShipping(int distance) {
        return distance * 40;
    }

    public Client findClient(String phoneNumberOfClient) {
        for (Client aux : listCustomers) {
            if (aux.getPhoneNumber()==phoneNumberOfClient)
                return aux;
        }
        return null;
    }

    public Product findProduct(String nameOfProduct) {
        for (Product aux : listProducts) {
            if (aux.getName().compareToIgnoreCase(nameOfProduct)==0)
                return aux;
        }
        return null;
    }

    public boolean agreeOrder(String phoneNumberOfCustomer, String nameOfProduct, int distance) {
        double priceFinal = 0;
        Client clientToOrder = findClient(phoneNumberOfCustomer);
        Product productToOrder = findProduct(nameOfProduct);
        int posOfProduct=listProducts.indexOf(productToOrder);



        if (clientToOrder != null && productToOrder != null) {

            if (productToOrder.getStock()>0){
                listProducts.get(posOfProduct).setStock(listProducts.get(posOfProduct).getStock()-1);
            if (clientToOrder instanceof Company) {

                priceFinal = calculateShipping(distance) + productToOrder.getPrice();

                priceFinal = priceFinal * ((Company) clientToOrder).getDiscount() / 100;

                Order orderToAgree = new Order(priceFinal, clientToOrder);

                orderToAgree.addProductToList(productToOrder);

                return listOrders.add(orderToAgree);

            } else if (clientToOrder instanceof Particular) {

                priceFinal = calculateShipping(distance) + productToOrder.getPrice();

                Order orderToAgree = new Order(priceFinal, clientToOrder);

                orderToAgree.addProductToList(productToOrder);

                return listOrders.add(orderToAgree);

            }

            }
        }
        listProducts.get(posOfProduct).setStock(listProducts.get(posOfProduct).getStock()+1);
        return false;
    }
    public double calculatePromedy()
    {
        int accountantSales=0;
        double promedy=0;
        for (Order aux:listOrders)
        {
            promedy=promedy+aux.getTotalCost();
            accountantSales++;
        }
        return promedy/accountantSales;
    }
}
