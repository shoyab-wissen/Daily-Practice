package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.models.lappy.Laptop;

@Component
public class Employee implements Person {
	@Value("Shoyab")
	private String name;
	@Value("Developer")
	private String designation;
	@Value("999999.99")
	private double salary;
	@Value("1")
	private int eid;
	@Autowired
	private Address address;
	@Autowired
//	@Qualifier("macBook")
	private Laptop laptop;
	@Override
	public String toString() {
		System.out.println(laptop);
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", eid=" + eid
				+ ", address=" + address + "]";
	}
	
	
}
