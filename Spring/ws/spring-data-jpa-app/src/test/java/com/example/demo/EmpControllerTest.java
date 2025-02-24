package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.EmpController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@WebMvcTest(controllers = EmpController.class)
public class EmpControllerTest {
	@MockBean
	private EmpService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetEmployee() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/employee")).andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetEmployeeById() {
		try {
			List<Employee> l1 = new ArrayList<Employee>();
			l1.add(new Employee());
			Mockito.when(service.getEmployee()).thenReturn(l1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
