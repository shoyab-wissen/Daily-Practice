package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpDao;

@Service
public class EmpService {
	@Autowired
	EmpDao empDao;
	public Iterable<Employee> getEmployee() {
		return empDao.findAll();
	}
	
	public String addEmployee( Employee emp) {
		if(empDao.existsById(emp.getEid())) {
			return "Cannot add, ID already exist";
		}
		empDao.save(emp);
		return "Added Successfully";
	}
	
	public String updateEmployee( Employee emp,  int id) {
		if(!empDao.existsById(id)) {
			return "The ID Does not exist in the table";
		}
		empDao.save(emp);
		return "Updated Successfully";
	}
	
		public String deleteEmployee( int id) {
		if(!empDao.existsById(id)) {
			return "Cannot delete, ID Does not exist";
		}
		empDao.delete(empDao.findById(id).get());
		return "Deleted Successfully";
	}
}
