package com.microservice.departmentservices.repository;

import com.microservice.departmentservices.entity.Department;

public interface Departmentservice {
	
	 Department saveDepartment(Department department);

	 Department getDepartmentById(Long departmentId);
}
