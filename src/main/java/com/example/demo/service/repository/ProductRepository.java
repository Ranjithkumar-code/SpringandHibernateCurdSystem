package com.example.demo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
