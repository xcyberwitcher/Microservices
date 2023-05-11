package com.microservice.departmentservices.serviceImp;
import org.springframework.stereotype.Service;
import com.microservice.departmentservices.entity.Department;
import com.microservice.departmentservices.repository.DepartmentRepository;
import com.microservice.departmentservices.repository.Departmentservice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImp  implements Departmentservice{
	  
	    private DepartmentRepository departmentRepository;

	    @Override
	    public Department saveDepartment(Department department) {
	        return departmentRepository.save(department);
	    }

	    @Override
	    public Department getDepartmentById(Long departmentId) {
	        return departmentRepository.findById(departmentId).get();
	    }
}
