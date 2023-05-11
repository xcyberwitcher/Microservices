package com.microservice.orderservice.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.microservice.orderservice.constant.AppConst;
@Entity
@Table(name=AppConst.ORDER_INFO)
public class OrderDetails implements Serializable{
	
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="orderNumber")
	private Long orderNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="order_id")
	private List<OrderLineItem> orderLineList;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public List<OrderLineItem> getOrderLineList() {
		return orderLineList;
	}

	public void setOrderLineList(List<OrderLineItem> orderLineList) {
		this.orderLineList = orderLineList;
	}

	
	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
		
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderNumber=" + orderNumber + ", orderLineList=" + orderLineList + "]";
	}

}
