package com.employemanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employemanagement.entity.Employee;
import com.employemanagement.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeManagementSystemApplication.class, args);
	}
    @Autowired
    private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = new Employee("Ramesh","kumar","ramesh@gmail.com");
		employeeRepository.save(employee1);
		
		Employee employee2 = new Employee("Amir","khan","amir@gmail.com");
		employeeRepository.save(employee2);
		
		Employee employee3= new Employee("adi","khanna","adi@gmail.com");
		employeeRepository.save(employee3);
		
	}

}
