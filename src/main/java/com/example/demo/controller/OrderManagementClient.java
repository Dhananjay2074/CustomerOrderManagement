package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Configuration;
import com.example.demo.model.Order;

import feign.Headers;

@FeignClient(name = "OderClient", url = "http://localhost:8080/", configuration = Configuration.class)
public interface OrderManagementClient {

	@RequestMapping(value = "/storeOrder", method = RequestMethod.POST)
	@Headers("Content-Type: application/json")
	public ResponseEntity<Order> createOrder(@RequestBody Order oder);

}
