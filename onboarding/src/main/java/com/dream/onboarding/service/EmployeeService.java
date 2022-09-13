package com.dream.onboarding.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.dream.onboarding.entity.Employee;

@Service

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	
	Employee saveEmployee(Employee Employee);
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee Employee);
	
	void deleteEmployeeById(Long id);
}

		
