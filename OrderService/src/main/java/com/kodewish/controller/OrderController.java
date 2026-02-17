package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.request.OrderRequest;
import com.kodewish.service.OrderServices;

@RestController
@RequestMapping("/amazon")
public class OrderController {
	
	@Autowired
	OrderServices service;
	
	@PostMapping("/createorder")
	public ResponseEntity createOrder(@RequestBody OrderRequest order ) {
		
		return service.createOrder(order);
		
	}

}
