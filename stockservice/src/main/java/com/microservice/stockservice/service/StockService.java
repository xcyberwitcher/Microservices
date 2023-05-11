package com.microservice.stockservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.stockservice.entity.Stock;
import com.microservice.stockservice.repository.StockRepository;
@Service
public class StockService {
@Autowired
private StockRepository repository;

    public void saveStock(Stock stock) {
	  repository.save(stock);
   }
    public Long findStockNumberByStockId(Long stockId) {
    	Stock getStockByStockId = StockRepository.getStockNumberByStockId(stockId);
    	return getStockByStockId.getStockNumber();
    }

}
