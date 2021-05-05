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
public class MernisServiceAdaptor implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
  
        return false;
        //KPSPublicSoapClient client = new KPSPublicSoapClient)();
        
      
        }
    
}



