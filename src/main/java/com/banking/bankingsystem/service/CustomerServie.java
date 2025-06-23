package com.banking.bankingsystem.service;
import com.banking.bankingsystem.model.Customer;
import java.util.List;


public interface CustomerServie {
	List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer updateCustomer(Long id, Customer updatedCustomer);
}
