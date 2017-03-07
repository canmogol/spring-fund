package com.fererlab.repository;

import com.fererlab.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsernameField}")
    private String dbUsername;

    public HibernateCustomerRepositoryImpl() {
        System.out.println("constructor dbUsername = " + dbUsername);
        System.out.println("HibernateCustomerRepositoryImpl.HibernateCustomerRepositoryImpl");
    }

    public List<Customer> findAll() {
        System.out.println("findAll dbUsername = " + dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Wick");
        customers.add(customer);

        return customers;
    }

//    public void setDbUsername(String dbUsername) {
//        System.out.println("set dbUsername = " + dbUsername);
//        this.dbUsername = dbUsername;
//    }
}
