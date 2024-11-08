package com.Bcode.Ecart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bcode.Ecart.models.Product;
import com.Bcode.Ecart.repositiories.ProductRepository;

@Service
public class ProductService {
	@Autowired 
	private ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	 

}
