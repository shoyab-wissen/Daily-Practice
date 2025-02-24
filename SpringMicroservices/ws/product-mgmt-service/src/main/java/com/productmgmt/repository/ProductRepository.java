package com.productmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmgmt.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{


}
