package com.microservice.orderservice.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.microservice.orderservice.constant.AppConst;
@Entity
@Table(name=AppConst.ORDERILINETEAM_INFO)
public class OrderLineItem  implements Serializable{		
	@Id
	@Column(name="id")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Long id;
	
	@Column(name="stockCode")
	private Long stockCode;
	
	@Column(name="price")
	private Double price;
	
	
	@Column(name="quantity")
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStockCode() {
		return stockCode;
	}

	public void setStockCode(Long stockCode) {
		this.stockCode = stockCode;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderLineItem [id=" + id + ", stockCode=" + stockCode + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}