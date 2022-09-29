package com.tamerb.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        //configuration context
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(IocConfig.class);

        ICustomerService customerService = appContext.getBean("service", ICustomerService.class);
        customerService.add();


    }
}

