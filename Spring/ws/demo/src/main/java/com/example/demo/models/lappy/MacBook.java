package com.example.demo.models.lappy;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component
@Priority(1)
public class MacBook implements Laptop{
	public String toString() {
		return "U got MacBook laptop";
	}
}
