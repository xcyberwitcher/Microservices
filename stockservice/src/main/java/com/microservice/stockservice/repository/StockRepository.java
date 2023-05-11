package com.microservice.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.stockservice.dto.StockDto;
import com.microservice.stockservice.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

	static Stock getStockNumberByStockId(Long stockId) {
		// TODO Auto-generated method stub
		return null;
	}
}
