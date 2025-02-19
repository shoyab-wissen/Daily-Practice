package com.example.model;

import org.springframework.stereotype.Component;

public class Employee {
	private String name;
	private double salary;
	private String designation;
	private int age;
	private Address address;
	
	public Employee(){
		System.out.println("Employee created");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", age=" + age
				+ ", address=" + address + "]";
	}
	public Employee(String name, double salary, String designation, int age, Address address) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
		this.address = address;
		System.out.println("Employee(String name, double salary, String designation, int age, Address address) created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
