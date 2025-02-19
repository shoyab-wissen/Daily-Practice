package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class Parameter {

	@GetMapping("/query")
	public String queryParam(String name, int age) {
		return "<h1>Hello "+name+" you are "+age+" years old</h1>";
	}
	
	@GetMapping("/query2")
	public String queryParamWithRequestParam(@RequestParam("user") String name, @RequestParam int age) {
		return "<h1>Hello "+name+" you are "+age+" years old</h1>";
	}
	
	@GetMapping("/path/{name}/{age}")
	public String pathParameter(@PathVariable String name, @PathVariable int age) {
		return "<h1>Hello "+name+" you are "+age+" years old</h1>";
	}
	
	@GetMapping("/body")
	public String bodyParam(@RequestBody Person person) {
		return "<h1>Hello "+person.getName()+" you are "+person.getAge()+" years old</h1>";
	}
	
	@GetMapping(path="/person", produces = "application/json")
	public List<Person> getPerson(){
		List<Person> person = new ArrayList<>();
		person.add(new Person("Shoyab", 22));
		person.add(new Person("Sanjana", 22));
		person.add(new Person("Kaif", 21));
		person.add(new Person("Omkar", 21));
		person.add(new Person("Sarvesh", 21));
		person.add(new Person("Sanchit", 21));
		return person;
	}
	//except json everything else needs dependencies of jackson
	@GetMapping(path="/personxml", produces = "application/xml")
	public List<Person> getPersonXML(){
		List<Person> person = new ArrayList<>();
		person.add(new Person("Shoyab", 22));
		person.add(new Person("Sanjana", 22));
		person.add(new Person("Kaif", 21));
		person.add(new Person("Omkar", 21));
		person.add(new Person("Sarvesh", 21));
		person.add(new Person("Sanchit", 21));
		return person;
	}
	
	@GetMapping(path="/personyaml", produces = "application/yaml")
	public List<Person> getPersonYaml(){
		List<Person> person = new ArrayList<>();
		person.add(new Person("Shoyab", 22));
		person.add(new Person("Sanjana", 22));
		person.add(new Person("Kaif", 21));
		person.add(new Person("Omkar", 21));
		person.add(new Person("Sarvesh", 21));
		person.add(new Person("Sanchit", 21));
		return person;
	}
}

