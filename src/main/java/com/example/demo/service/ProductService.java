package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.service.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository repository;
	
	public Product addProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> addProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductsById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductsByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product remove by id = "+id;
	}
	
	public Product updateProduct(Product product) {
		Product orinalproProduct = repository.findById(product.getId()).orElse(null);	
		orinalproProduct.setName(product.getName());
		orinalproProduct.setPrice(product.getPrice());
		orinalproProduct.setQuantity(product.getQuantity());
		return repository.save(orinalproProduct);
		}
}
