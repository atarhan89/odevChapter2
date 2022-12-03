package org.example;

import Abstract.ICustomerCheckService;
import Concrete.NeroCustomerManager;
import Entities.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    private ICustomerCheckService Customer;
    NeroCustomerManager neroCustomerManager= new NeroCustomerManager(Customer);
    
}
