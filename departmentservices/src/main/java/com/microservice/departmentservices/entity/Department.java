package com.microservice.departmentservices.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.microservice.departmentservices.constant.AppConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = AppConst.DEPARTMENT)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Department {
	    @Id
	    @GenericGenerator(name="info",strategy ="increment")
	    @GeneratedValue(generator ="info")
	    private Long id;
	    private String departmentName;
	    private String departmentAddress;
	    private String departmentCode;
}
