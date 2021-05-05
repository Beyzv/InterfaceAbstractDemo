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
public class StarbucksCustomerManager extends BaseCustomerManager{
   
    private ICustomerCheckService _CustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
      _CustomerCheckService=customerCheckService;
    }
    
    
    public void save(Customer customer){
        if (_CustomerCheckService.CheckIfRealPerson(customer)) {
        System.out.println("saved to db : " + customer.firstName);  
        }
        else
            System.out.println("Not a valid person");
        
    }
}
