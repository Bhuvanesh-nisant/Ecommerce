package com.Bcode.Ecart.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	public List<Map<String,Object>> getAllProduct(){
		return Arrays.asList(
				Map.of()
				);
		
	}

}
