package com.microservice.departmentservices.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.departmentservices.constant.AppConst;
import com.microservice.departmentservices.entity.Department;
import com.microservice.departmentservices.repository.Departmentservice;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
@RequestMapping(value =AppConst.FORWARD_SLASH)
public class DepartmentController {
	
	    private Departmentservice departmentService;

	    @PostMapping(value = AppConst.DEPARTMENT_INFO)
	    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
	        Department savedDepartment = departmentService.saveDepartment(department);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	    @GetMapping(value = AppConst.GET_DEPARTMENT_INFO_BY_ID)
	    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
	        Department department = departmentService.getDepartmentById(departmentId);
	        return ResponseEntity.ok(department);
	    }
}
