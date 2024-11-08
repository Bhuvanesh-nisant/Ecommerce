package com.Bcode.Ecart.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bcode.Ecart.models.Product;
import com.Bcode.Ecart.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
		
	}


