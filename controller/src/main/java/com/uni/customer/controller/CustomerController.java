package com.uni.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uni.customer.domain.aggregate.Customer;
import com.uni.customer.domain.service.CustomerService;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@GetMapping("customer/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		logger.info("Inside CustomerController........");
		return customerService.getCustomerById(customerId);
	}

	@PostMapping("customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		logger.info("Inside CustomerController........");
		return customerService.createCustomerById(customer);
	}

}
