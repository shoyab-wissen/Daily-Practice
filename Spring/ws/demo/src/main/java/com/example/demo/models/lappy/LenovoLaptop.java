package com.example.demo.models.lappy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component
//@Primary
@Priority(value = 3)
public class LenovoLaptop implements Laptop {
	public String toString() {
		return "U got Lenovo laptop";
	}
}