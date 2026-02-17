package com.kodewish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kodewish.entity.OrderEntity;
import com.kodewish.repository.OrderRepo;
import com.kodewish.request.OrderRequest;

@Service
public class OrderServiceImplements implements OrderServices {
	@Autowired
	OrderRepo repo;
	@Override
	public ResponseEntity createOrder(OrderRequest order) {
		OrderEntity entity=new OrderEntity();
		entity.setDescription(order.getDescription());
		entity.setItemName(order.getItemName());
		entity.setPrice(order.getPrice());
		entity.setQty(order.getQty());
		entity.setStatus(order.getStatus());
		repo.save(entity);
		
		return ResponseEntity.ok("done");
	}

}
