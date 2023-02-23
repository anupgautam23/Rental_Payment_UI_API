package com.masai.Service;


import com.masai.Model.Payment;

public interface PaymentService {
	
	public boolean savePayment(Payment payment) ;
	public Payment getPayment(Integer id);

}
