package com.employemanagement.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employemanagement.entity.Employee;
import com.employemanagement.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//handler method to handle list Employees and return mode and view
	@GetMapping("/Employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployee());
		return "employees";
		

	}
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		Employee employee=new Employee();
	     model.addAttribute("employee", employee);
		return "create_employee";
		
		
	}
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
		
	}
	@GetMapping("/employees/edit/{id}")
     public String editEmployeeForm(@PathVariable long id, Model model) {
    	 model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "edit_employee";
     }
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee") Employee employee,
			Model model) 
			
			 {
		
		Employee existingEmployee = employeeService.getEmployeeById(id);
		employeeService.setId();
		employeeService.setFirstName(employee.getFirstName());
		employeeService.setLastName(employee.getLastName());
		employeeService.setemail(employee.getEmail());
		
		employeeService.updateEmployee(existingEmployee);
		return "redirect:/employee";
	}
	@GetMapping("/employee/{id}")
         public String deleteEmployee(@PathVariable Long Id) {
		employeeService.deleteEmployeeById(Id);
		return "redirect:/employee";
        	 
         }



}




