package com.microservice.orderservice.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.orderservice.constant.AppConst;

@FeignClient("product-service")
public interface ProductClient {
    @GetMapping(value = AppConst.GET_PRODUCT_PRICE)
	public @ResponseBody Double getProductPriceById(@PathVariable("id") Long id);
}
