package com.microservice.productservice.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.microservice.productservice.controller.ProductController;
import com.microservice.productservice.entity.Product;
import com.microservice.productservice.repository.ProductRepository;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
@Service
public class ProductService {
	@Autowired
    private ProductRepository productRepository;
	//private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	 
	 public void saveProductDetails(Product product) { 
		 productRepository.save(product);
	 }
	 
	 public List<Product> getAllProductDetails(){
		 return productRepository.findAll();
	 }
	 

	     private CircuitBreaker circuitBreaker;

	     public void MyService(CircuitBreaker circuitBreaker) {
	         this.circuitBreaker = circuitBreaker;
	     }

	     @CircuitBreaker(name = "circuitBreakerName")
	     public String serviceMethod() {
	         // service logic here
	     }
	 }

