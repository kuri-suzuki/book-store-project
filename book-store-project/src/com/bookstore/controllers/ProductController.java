package com.bookstore.controllers;

import com.bookstore.dao.ProductDAO;
import com.bookstore.dao.ProductDAOImpl;
import com.bookstore.model.Product;

public class ProductController {
	
	public static void main(String[] args) {
		
		ProductController productController = new ProductController();
		productController.registerProduct();
		
	}
	
	public void registerProduct() {
		Product product = new Product();
		ProductDAO prodDao = new ProductDAOImpl();
		
		product.setProductId(1);
		product.setProductName("Monggol");
		product.setCategory("Pencil");
		product.setDescription("Abc def ghi");
		product.setPrice(7.0);
		product.setQuantity(20);
		prodDao.save(product);
		System.out.println(prodDao.findById(1));
	} 

}
