package com.microservice.productservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.productservice.constant.AppConst;
import com.microservice.productservice.entity.Product;
import com.microservice.productservice.service.ProductService;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

@RestController
@RequestMapping(value = AppConst.FORWARD_SLASH)
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//@Value("${logging.file.name}")
	private String loggerPath;
	//private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping(value = AppConst.SAVE_PRODUCT)
     public void saveProductDetails(@RequestBody Product product) {
		//LOGGER.info("inside saveProductDetails() of "
				//+ "ProductController"+" product{}:"+product);
 		productService.saveProductDetails(product);
     }
	@GetMapping(value=AppConst.FINDALL_PRODUCT)
	public @ResponseBody List<Product> getAllProductDetails(){
		return productService.getAllProductDetails();
	}

	    @Bean
	    public CircuitBreakerRegistry circuitBreakerRegistry() {
	        return CircuitBreakerRegistry.ofDefaults();
	    }

	    @Bean
	    public CircuitBreaker circuitBreaker() {
	        return circuitBreakerRegistry().circuitBreaker("circuitBreakerName");
	    }
	}

