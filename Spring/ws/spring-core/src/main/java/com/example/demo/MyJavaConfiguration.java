package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Address;
import com.example.model.Employee;
import com.example.model.Student;

@Configuration
public class MyJavaConfiguration {
	@Bean("employee")
	public Employee getEmployee() {
		return new Employee("Shoyab", 9999999.99, "Developer", 22, getAddress());
	}
	
	@Bean("student")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean("address")
	public Address getAddress() {
		return new Address("Maharastra", "Mumbai", 400059);
	}
	
	@Bean("address_s")
	Address getAddress2() {
		Address ad = new Address();
		ad.setCity("Mumbai");
		ad.setState("Maharashtra");
		ad.setPin(400059);
		return ad;
	}
	
	@Bean("emp_s")
	Employee getEmployee2() {
		Employee emp = new Employee();
		emp.setAddress(getAddress());
		emp.setAge(22);
		emp.setDesignation("Developer");
		emp.setName("Shoyab Siddique");
		emp.setSalary(999999.99);
		return emp;
	}
}
