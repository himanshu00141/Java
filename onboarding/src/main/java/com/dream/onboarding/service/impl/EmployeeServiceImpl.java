package com.dream.onboarding.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dream.onboarding.entity.Employee;

public class EmployeeServiceImpl {

	@Autowired
	private Employee EmployeeRepository;
	
	public EmployeeServiceImpl(Employee EmployeeRepository) {
		super();
		this.EmployeeRepository = EmployeeRepository;
	}
	
	
	public Employee getAllEmployees() {
		return EmployeeRepository;
	}
	
	public Employee saveEmployee(Employee Employee) {
		return EmployeeRepository;
	}
	public Employee getEmployeeById(Long id) {
		return EmployeeRepository;
	}

	public Employee updateEmployee(Employee Employee) {
		return EmployeeRepository;
	}

	public void deleteEmployeeById(Long id) {
		return;	
	}

}


