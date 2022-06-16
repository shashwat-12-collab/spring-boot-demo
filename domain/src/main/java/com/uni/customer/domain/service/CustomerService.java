package com.uni.customer.domain.service;

import com.uni.customer.domain.aggregate.Customer;

public interface CustomerService {

	public Customer getCustomerById(String customerId);

	public Customer createCustomerById(Customer customer);

}
