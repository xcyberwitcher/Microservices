package com.microservice.orderservice.dto;

import java.util.List;

import com.microservice.orderservice.entity.OrderLineItem;
public class OrderDto {
	
	private List<OrderLineItem> list;
	
	

	public List<OrderLineItem> getList() {
		return list;
	}

	public void setList(List<OrderLineItem> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "OrderDto [list=" + list + "]";
	}
	

}
