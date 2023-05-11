package com.microservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.orderservice.constant.AppConst;
import com.microservice.orderservice.dto.OrderDto;
import com.microservice.orderservice.service.OrderService;

@RestController
@RequestMapping(value =AppConst.FORWARD_SLASH)
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
	
	@PostMapping(value = AppConst.PLACE_ORDER)
	public void placeOrder(@RequestBody OrderDto orderDto)
	{
		orderService.placeOrder(orderDto);
	}

}

