package com.pulkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulkit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
