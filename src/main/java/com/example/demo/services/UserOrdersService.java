package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrderRepository;

@Service
public class UserOrdersService {
	@Autowired
	private OrderRepository orderRepository;

	public void createUserOrder(Orders order) {
		orderRepository.save(order);
	}
}
