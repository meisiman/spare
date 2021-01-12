package com.example.spare.service.impl;

import com.example.spare.dao.CustomerMapper;
import com.example.spare.entity.Customer;
import com.example.spare.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Siman
 * @date 2020/11/27 10:50
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }

    @Override
    public int deleteCustomerById(int id) {
        return customerMapper.deleteCustomerById(id);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return customerMapper.queryAllCustomer();
    }

    @Override
    public Customer queryCustomerById(int id) {
        return customerMapper.queryCustomerById(id);
    }

    @Override
    public List<Customer> queryCustomerByName(String name) {
        return customerMapper.queryCustomerByName(name);
    }
}
