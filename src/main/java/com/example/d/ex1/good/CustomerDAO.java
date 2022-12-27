package com.example.d.ex1.good;

import com.example.d.ex1.bad.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();
}
