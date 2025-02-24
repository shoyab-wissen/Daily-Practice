package com.productmgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.productmgmt.entity.Product;
import com.productmgmt.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController(value = "")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@PostMapping("/product/add")
	public String addProduct(@RequestBody Product prod) {
		return service.addProduct(prod);
	}
	
}
