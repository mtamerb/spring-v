package com.tamerb.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //configuration context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();


    }
}

