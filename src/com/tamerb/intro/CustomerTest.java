package com.tamerb.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

    public static void main(String[] args) {

        //configuration context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/tamerb/intro/applicationContext.xml");


        ICustomerService customerService = context.getBean("service", ICustomerService.class);


       /* CustomerManager customerManager =
                new CustomerManager(context.getBean("database", ICustomerDal.class));*/

        customerService.add();


    }
}

