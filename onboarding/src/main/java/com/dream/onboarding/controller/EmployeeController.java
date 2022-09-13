package com.dream.onboarding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dream.onboarding.entity.Employee;
import com.dream.onboarding.service.EmployeeService;


@Controller
public class EmployeeController {
	
	private EmployeeService EmployeeService;

	public EmployeeController(EmployeeService EmployeeService) {
		super();
		this.EmployeeService = EmployeeService;
	}
	
	@GetMapping("/Employee")
	public String listEmployees(Model model) {
		model.addAttribute("Employees");
		return "Employee";
	}
	
	@GetMapping("/Employee/personal")
	public String createEmployeePersonalForm(Model model) {
		
		Employee EmployeeAdd = new Employee();
		model.addAttribute("Employee", EmployeeAdd);
		return "PersonalDetails";
		
	}
	
	@PostMapping("/Employee/personal")
	public String saveEmployee(@ModelAttribute("Employee") Employee Employee) {
		EmployeeService.saveEmployee(Employee);
		return "redirect:/Employee";
	}
	
	@GetMapping("/Employee/address}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("EmployeeAdd", EmployeeService);
		return "Address";
	}

	@PostMapping("/Employee/address")
	public String updateEmployeeAdd(@PathVariable Long id,
			@ModelAttribute("EmployeeAdd") Employee Employee,Model model) {
		
		
		return "redirect:/Employee";		
	}
	
	
	@GetMapping("/Employees/education")
	public String updateEmployeeEdu(@PathVariable Long id) {
			return "Education";
	}
	@PostMapping("/Employee/eduation")
	public String EmployeeAdd(@PathVariable Long id,
			@ModelAttribute("Employee") Employee Employee,Model model) {
		
		
		return "redirect:/Employee";	
	
}
}
	



