package com.Bcode.Ecart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	public Product(String name, double price, String description, double ratings, String category, String seller,
			int stock, int numOfReviews) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.ratings = ratings;
		this.category = category;
		this.seller = seller;
		Stock = stock;
		this.numOfReviews = numOfReviews;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public int getNumOfReviews() {
		return numOfReviews;
	}
	public void setNumOfReviews(int numOfReviews) {
		this.numOfReviews = numOfReviews;
	}
	private String name;
	private double price;
	private String description;
	private double ratings;
	private String category;
	private String seller;
	private int Stock;
	private int numOfReviews;

	public Product() {
		super();
	}

}
