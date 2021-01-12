package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/saveProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@PostMapping("/saveProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.addProducts(products);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/getproductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductsById(id);
	}
	
	@GetMapping("/getproductByName/{name}")
	public Product getProductById(@PathVariable String name) {
		return service.getProductsByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
}
