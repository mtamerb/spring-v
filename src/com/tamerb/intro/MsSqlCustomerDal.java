package com.tamerb.intro;

public class MsSqlCustomerDal implements ICustomerDal{




    @Override
    public void add(){
        System.out.println("Added to MsSQL database.");
    }
}
