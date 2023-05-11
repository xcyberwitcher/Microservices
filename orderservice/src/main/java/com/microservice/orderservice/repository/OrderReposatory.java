package com.microservice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.orderservice.entity.OrderDetails;

public interface OrderReposatory extends JpaRepository<OrderDetails, Long> {

	

}
