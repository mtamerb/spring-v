package com.tamerb.intro;

public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Added to MySQL database.");
    }
}
