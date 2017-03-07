package com.fererlab;

import com.fererlab.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

//01
//        CustomerService service = new CustomerServiceImpl();

//02 bean definitions
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("ApplicationContext02.xml");
//        CustomerService service = context.getBean("customerService", CustomerService.class);
//        System.out.println(service.findAll().get(0).getFirstName());

//03 annotations
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("ApplicationContext03.xml");
//        CustomerService service = context.getBean("customerService", CustomerService.class);
//        System.out.println(service.findAll().get(0).getFirstName());

//04 Configuration
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        CustomerService service = context.getBean("customerService", CustomerService.class);
//        System.out.println(service.findAll().get(0).getFirstName());

//05 Properties
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("ApplicationContext04.xml");
//        CustomerService service = context.getBean("customerService", CustomerService.class);
//        System.out.println(service.findAll().get(0).getFirstName());

//06 Properties Config
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = context.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());

    }

}
