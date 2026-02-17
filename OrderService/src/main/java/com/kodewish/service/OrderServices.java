package com.kodewish.service;

import org.springframework.http.ResponseEntity;

import com.kodewish.request.OrderRequest;

public interface OrderServices {
	public ResponseEntity createOrder(OrderRequest order);

}
