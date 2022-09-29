package com.tamerb.intro;

public class MySqlCustomerDal implements ICustomerDal {


    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    private String connectionString;



    @Override
    public void add() {
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("Added to MySQL database.");


    }


}
