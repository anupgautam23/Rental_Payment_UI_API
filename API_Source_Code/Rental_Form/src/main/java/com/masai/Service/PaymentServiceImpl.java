package com.masai.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Payment;
import com.masai.Repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository paymentDao;
	
	@Override
	public boolean savePayment(Payment payment) {
	  Payment  pay =   paymentDao.save(payment);
	  if(pay!=null) return true; 
	  else return false ; 
	}

	@Override
	public Payment getPayment(Integer id) {
		Optional<Payment> payOpt = paymentDao.findById(id);
		
		return payOpt.get();
	}

}
