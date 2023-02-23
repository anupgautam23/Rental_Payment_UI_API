package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.RentOrder;
import com.masai.Repository.OrderRepository;

@Service
public class OrderServiceImpl implements  OrderService{
	
	@Autowired
	OrderRepository orderDao;
	

	@Override
	public RentOrder saveOrder(RentOrder order) {
		RentOrder savedOrder = orderDao.save(order);
		return savedOrder;
	}

	@Override
	public List<RentOrder> getOrder() {
		List<RentOrder> list = orderDao.findAll();
		return list;
	}

}
