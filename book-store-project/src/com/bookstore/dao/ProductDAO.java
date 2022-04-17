package com.bookstore.dao;

import java.util.List;

import com.bookstore.model.Product;

public interface ProductDAO {
	
	void findById(Product product, int id);
	List<Product> findAll();

}
