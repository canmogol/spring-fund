package com.fererlab.service;

import com.fererlab.model.Customer;
import com.fererlab.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service("customerService")
//@Scope("singleton") // singleton is default @Scope without any parameter is singleton
//@Scope("singleton")
//@Scope(SCOPE_SINGLETON)
@Scope(SCOPE_PROTOTYPE) //  will create a new instance for each bean request
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        System.out.println("CustomerServiceImpl.CustomerServiceImpl");
    }

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("CustomerServiceImpl.CustomerServiceImpl customerRepository");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("CustomerServiceImpl.setCustomerRepository");
        this.customerRepository = customerRepository;
    }

//    public void setFoo(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
