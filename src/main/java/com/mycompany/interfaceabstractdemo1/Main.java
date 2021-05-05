/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaceabstractdemo1;

/**
 *
 * @author omerfaruk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Customer customer=new Customer();
        customer.id=1;
        customer.firstName="Beyza";
        customer.lastName="Işık";
        customer.nationalityId="15632489";
        customer.yearOfBirth=2002;
        CustomerCheckManager customerCheckManager=new CustomerCheckManager();
        BaseCustomerManager customerManager= new StarbucksCustomerManager(customerCheckManager);
        customerManager.save(customer);  
    }
    
}
