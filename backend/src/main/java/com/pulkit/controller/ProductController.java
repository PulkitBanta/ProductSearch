package com.pulkit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pulkit.model.Product;
import com.pulkit.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getProducts() {
		return this.productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable long id) {
		return this.productService.getProduct(id);
	}
	
	@GetMapping("/search")
	public List<Product> getSearchProduct(@RequestParam String query) {
		return this.productService.searchProducts(query);
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestParam Product product) {
		return this.productService.addProduct(product);
	}
}
