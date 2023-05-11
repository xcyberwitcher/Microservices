package com.microservice.orderservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.orderservice.dto.OrderDto;
import com.microservice.orderservice.entity.OrderDetails;
import com.microservice.orderservice.repository.OrderReposatory;
import com.microservice.orderservice.repository.ProductClient;
import com.microservice.orderservice.repository.StockClient;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderReposatory orderReposatory;
	
	@Autowired
	private ProductClient productClient;
	
	@Autowired
	private StockClient stockClient;
	
	
	public void placeOrder(OrderDto orderDto)
	{
		OrderDetails orderDetails= new OrderDetails();
		orderDetails.setOrderNumber(new Random().nextLong(1000,100000));
		orderDetails.setOrderLineList(orderDto.getList());	
		orderReposatory.save(orderDetails);
		
	}
	


}

