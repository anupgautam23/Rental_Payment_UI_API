package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.RentOrder;

@Repository
public interface OrderRepository extends JpaRepository<RentOrder, Integer> {

	
}
