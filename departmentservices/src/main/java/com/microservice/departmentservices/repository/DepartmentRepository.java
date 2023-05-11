package com.microservice.departmentservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.departmentservices.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
