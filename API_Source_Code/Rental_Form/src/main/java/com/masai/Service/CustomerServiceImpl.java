package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Customer;
import com.masai.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	CustomerRepository customerDao ; 

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		
		return customerDao.findAll();
	}

}
