package com.uni.customer.repository.repository;

import com.uni.customer.domain.aggregate.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
