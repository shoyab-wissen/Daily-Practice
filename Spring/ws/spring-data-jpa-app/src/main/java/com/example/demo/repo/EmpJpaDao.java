package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmpJpaDao extends JpaRepository<Employee, Integer>{
	
	@Query("from EMP where designation=?1 order by age desc")
	public List<Employee> customJpaQuery(String desig);
}
