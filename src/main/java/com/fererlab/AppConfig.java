package com.fererlab;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.fererlab"})
@PropertySource("app.properties")
public class AppConfig {

    public static PropertySourcesPlaceholderConfigurer
    getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
////        customerService.setCustomerRepository(getCustomerRepository());
//        return customerService;
//    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }


}
