package com.bookstore.dao;

import java.util.List;

import com.bookstore.model.Product;

public interface ProductDAO {

	void save (Product product);
	void update (Product product, int id);
	Product findById(int id);
	List<Product> findAll();

}
