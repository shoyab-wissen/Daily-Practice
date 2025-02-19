package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Employee;
import com.example.demo.models.Person;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BeanFactory factory = SpringApplication.run(DemoApplication.class, args);
		Person p1 = (Person) factory.getBean("employee");
		Person p2 = (Person) factory.getBean("student");
		System.out.println(p1);
		System.out.println(p2);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter which object to create");
//		String object = sc.nextLine();
//		Person p3 = (Person) factory.getBean(object);
//		System.out.println(p3);
		System.out.println("Welcome to springboot application");
	}

}
