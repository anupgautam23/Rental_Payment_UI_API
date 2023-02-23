package com.masai.Service;

import java.util.List;

import com.masai.Model.RentOrder;

public interface OrderService {

	public RentOrder saveOrder(RentOrder order);
	public List<RentOrder> getOrder();
}
