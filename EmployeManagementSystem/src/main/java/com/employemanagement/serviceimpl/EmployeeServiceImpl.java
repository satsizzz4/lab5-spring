package com.employemanagement.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employemanagement.entity.Employee;
import com.employemanagement.repository.EmployeeRepository;
import com.employemanagement.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
private EmployeeRepository employeeRepository;



	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}



	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();
	}



	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}



	@Override
	public void setLastName(String lastName) {
		
		
	}



	@Override
	public void setFirstName(String firstName) {
		
		
	}



	@Override
	public void setemail(String setEmail) {
		
		
	}



	@Override
	public void setId() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
	}

}
