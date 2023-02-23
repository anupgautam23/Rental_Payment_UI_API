package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Payment;
import com.masai.Service.PaymentService;

@CrossOrigin
@RestController
@RequestMapping("/Payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService ;
	
	@PostMapping("/save")
	private ResponseEntity<Boolean> savePayment(@RequestBody Payment payment){
		
		Boolean flag =  paymentService.savePayment(payment);
		return  new ResponseEntity<Boolean>(flag,HttpStatus.ACCEPTED);
	}
	
}
