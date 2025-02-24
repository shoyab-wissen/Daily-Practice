package com.productmgmt.service;

import java.util.List;
import java.util.Optional;

import com.productmgmt.entity.Product;

public interface ProductService {
	public String addProduct(Product prod);
	public List<Product> getAllProducts();
	public Optional<Product> getProductById(int pid);
	
}
