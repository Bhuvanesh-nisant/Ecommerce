package com.Bcode.Ecart.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bcode.Ecart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long >{
	

}
