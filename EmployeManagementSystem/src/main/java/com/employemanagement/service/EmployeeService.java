package com.employemanagement.service;

import java.util.List;

import com.employemanagement.entity.Employee;

public interface EmployeeService {
  Object setId = null;

List<Employee>getAllEmployee();
  
  Employee saveEmployee(Employee employee);
  
  Employee getEmployeeById(Long id);
  Employee updateEmployee(Employee employee);



void setLastName(String lastName);



void setFirstName(String firstName);

void setemail(String setEmail);

void deleteEmployeeById(Long id);

void setId();










}


