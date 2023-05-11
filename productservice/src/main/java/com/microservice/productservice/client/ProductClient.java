package com.microservice.productservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductClient {
	@GetMapping(value="/getProductPriceById/{id}")
	public double getProductPriceById(@PathVariable("id") Long id);
}