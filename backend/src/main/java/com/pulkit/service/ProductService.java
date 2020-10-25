package com.pulkit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulkit.model.Product;
import com.pulkit.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> getProducts() {
		return this.productRepo.findAll();
	}
	
	public Product getProduct(long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	
	public String addProduct(Product product) {
		this.productRepo.save(product);
		return "added";
	}
	
}
