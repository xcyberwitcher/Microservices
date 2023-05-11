package com.microservice.productservice.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.microservice.productservice.constant.AppConst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name =AppConst.PRODUCT_INFO)
public class Product implements Serializable{
@Id
@GenericGenerator(name="info",strategy ="increment")
@GeneratedValue(generator ="info")
@Column(name ="id")
private Long id;
@Column(name ="name")
private String name;
@Column(name ="description")
private String description;
@Column(name ="price")
private Double price;

}
