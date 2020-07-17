package com.example.demo.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Configuration;
import com.example.demo.model.Order;

import feign.Headers;

@FeignClient(name = "OrderStoreClient", url = "http://" + "${host}" + ":${port}", configuration = Configuration.class)
public interface OrderClient {
	@RequestMapping(value = "/storeOrder", method = RequestMethod.POST)
	@Headers("Content-Type: application/json")
	Order add(@RequestBody Order order);
}
