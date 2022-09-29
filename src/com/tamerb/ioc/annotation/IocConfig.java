package com.tamerb.ioc.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.tamerb.ioc.annotation")
@PropertySource("classpath:com/tamerb/ioc/annotation/values.properties")
public class IocConfig {

    @Bean
    public ICustomerDal data() {
        return new MySqlCustomerDal();
    }

    @Bean
    public ICustomerService service() {
        return new CustomerManager(data());
    }
}
