package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AppController {
	@Autowired
	private OrderManagementClient client;

	@PostMapping(value = "/createorder")
	public ResponseEntity<Order> createOrder(Order order) {

		return client.createOrder(order);
	}
}
