package com.employemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	List<Employee> findAll();

}
