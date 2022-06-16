package com.uni.customer.service.implementation;

import com.uni.customer.domain.aggregate.Customer;
import com.uni.customer.domain.service.CustomerService;
import com.uni.customer.repository.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(String customerId) {
		logger.info("Inside CustomerServiceImpl........");
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}

	@Override
	public Customer createCustomerById(Customer customer) {
		return customerRepository.save(customer);
	}

}
