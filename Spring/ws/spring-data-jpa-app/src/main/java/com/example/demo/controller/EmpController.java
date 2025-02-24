package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService service;
	
	@GetMapping("/employee")
	public Iterable<Employee> getEmployee() {
		return service.getEmployee();
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
		return "Added Successfully";
	}
	
	@RequestMapping(path="/employee/{id}",method = {RequestMethod.PUT, RequestMethod.PATCH})
	public String updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		service.updateEmployee(emp, id);
		return "Updated Successfully";
	}
	
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return "Deleted Successfully";
	}
}
