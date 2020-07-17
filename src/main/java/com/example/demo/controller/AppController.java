package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void createOrder(Order user) {

		client.createOrder(user);
	}
}
