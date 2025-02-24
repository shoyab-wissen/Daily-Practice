package com.productcatalog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.beans.Product;
import com.productcatalog.services.CatalogService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CatalogController {
	@Autowired
	CatalogService service;
	private static final String RESILIENCE4J_INSTANCE_NAME = "example";
	private static final String FALLBACK_METHOD = "fallback";

	@CircuitBreaker(name = RESILIENCE4J_INSTANCE_NAME, fallbackMethod = FALLBACK_METHOD)
	@GetMapping(path = "/catalog")
	public List<Product> getAllProducts() {
		return service.getAllProduct();
	}
	
	public List<String> fallback(Exception t) {
		return Collections.singletonList("Product Service temporily Unavalible");
	}
}
