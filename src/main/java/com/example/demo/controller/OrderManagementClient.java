package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Order;

@FeignClient(name = "OderClient", url = "http://localhost:8080/")
public interface OrderManagementClient {

	@PostMapping(value = "/createorder")
	public void createOrder(Order user);

}
