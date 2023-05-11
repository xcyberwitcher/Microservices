package com.microservice.stockservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.microservice.stockservice.constant.AppConst;

import lombok.Data;
@Data
@Entity
@Table(name = AppConst.STOCK)
public class Stock implements Serializable {

	@Id
	@GenericGenerator(name="info",strategy ="increment")
	@GeneratedValue(generator ="info")
	@Column(name ="id")
	private Long id;
	private Long stockId;
	private Long stockNumber;
	
	
}
