package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Lazy(value = false) for lazy initialization
//@Scope("prototype") for prototype design pattern
//@Scope("singleton") for singleton design pattern
public class Student implements Person {
	@Value("${user}")
	private String name;
	@Value("${rollNo}")

	private int rollNo;
	@Value("${standard}")
	private int std;
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", std=" + std + "]";
	}
	
}
