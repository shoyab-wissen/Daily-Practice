package com.productmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmgmt.entity.Product;
import com.productmgmt.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repo;
	
	@Override
	public String addProduct(Product prod) {
		// TODO Auto-generated method stub
		repo.save(prod);
		return "Addedd Successfully";
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Product> getProductById(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid);
	}
}
