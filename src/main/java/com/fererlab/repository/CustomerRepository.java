package com.fererlab.repository;

import com.fererlab.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
