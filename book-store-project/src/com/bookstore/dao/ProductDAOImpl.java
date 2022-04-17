package com.bookstore.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bookstore.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer, Product> products = new HashMap<>();

	@Override
	public void findById(Product product, int id) {
		products.get(id);
	}

	@Override
	public List<Product> findAll() {
		return new ArrayList<Product>(products.values());
	}



}
