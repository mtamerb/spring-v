package com.tamerb.ioc.annotation;


import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDal implements ICustomerDal {


    @Value("${database.connectionString}")
    private String connectionString;

    

    @Override
    public void add(){
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("Added to MsSQL database.");
    }
}
