package com.uni.customer.domain.aggregate;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Customer {

	@Id
	private String id;
	private String customerName;

	public String getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

}
