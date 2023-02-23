package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Customer;
import com.masai.Service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class UserController {
	
	@Autowired
	private CustomerService customerService ; 
	
	@PostMapping("/save")
	private ResponseEntity<Boolean> saveCustomer(@RequestBody Customer customer ) {
		
		Customer customer2 = customerService.saveCustomer(customer);
		if(customer2!=null) {
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(false,HttpStatus.OK);
		}
	}
	
	@GetMapping("/get")
	private ResponseEntity<List<Customer>> getCustomer(){
		
	 List<Customer> list =	customerService.getCustomer();
	return new ResponseEntity<List<Customer>>(list,HttpStatus.ACCEPTED);
	}
}
