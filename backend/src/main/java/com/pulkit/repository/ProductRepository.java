package com.pulkit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulkit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByNameIgnoreCaseContains(String name);

}
