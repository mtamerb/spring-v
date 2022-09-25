package com.tamerb.intro;

public class CustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Added to Oracle database.");
    }
}
