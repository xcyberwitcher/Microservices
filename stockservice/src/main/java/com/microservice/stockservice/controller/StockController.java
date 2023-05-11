package com.microservice.stockservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.stockservice.constant.AppConst;
import com.microservice.stockservice.entity.Stock;
import com.microservice.stockservice.service.StockService;

@RestController
@RequestMapping(value = AppConst.FORWARD_SLASH) 

public class StockController {
	
	@Autowired
	private StockService service;
	
	@PostMapping(name = AppConst.SAVE_STOCK)
	public void saveStock (@RequestBody Stock stock) {
		service.saveStock(stock);
	}
	@GetMapping(value = AppConst.FIND_STOCK_NUMBER_BY_ID)
	public @ResponseBody Long findStockNumber(@PathVariable("id") Long stockId) {
		return service.findStockNumberByStockId(stockId);
	}

}
