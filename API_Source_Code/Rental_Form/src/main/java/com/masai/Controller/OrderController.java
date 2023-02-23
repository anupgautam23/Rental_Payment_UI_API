package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.RentOrder;
import com.masai.Service.OrderService;


@CrossOrigin
@RestController
@RequestMapping("/Order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	private ResponseEntity<Boolean> saveOrder(@RequestBody RentOrder order) {
		
	
		RentOrder order2 = orderService.saveOrder(order);
		if(order2!=null) return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		else return new ResponseEntity<Boolean>( false,HttpStatus.OK);
		
		
	}
	
	
	@GetMapping("/get")
	private ResponseEntity<List<RentOrder>> getAllOrder(){
		List<RentOrder> list = orderService.getOrder();
	
		return new ResponseEntity<List<RentOrder>>(list,HttpStatus.OK);
	}
	
	

}
