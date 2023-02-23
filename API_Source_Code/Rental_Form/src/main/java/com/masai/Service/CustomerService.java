package com.masai.Service;

import java.util.List;

import com.masai.Model.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer>  getCustomer();

}
