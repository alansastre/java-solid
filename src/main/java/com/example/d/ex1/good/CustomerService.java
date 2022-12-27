package com.example.d.ex1.good;

import com.example.d.ex1.bad.Customer;

import java.util.List;

public class CustomerService {

    CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) { // Polimorfismo
        this.customerDAO = customerDAO;
    }

    public List<Customer> findAll(){
        return this.customerDAO.findAll();
    }
}
