package com.microservice.orderservice.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.orderservice.constant.AppConst;

public interface StockClient {

	@GetMapping(value = AppConst.GET_STOCKID_BY_ID)
	public @ResponseBody Double getStockIdById(@PathVariable("stockId") Long stockid);
}
