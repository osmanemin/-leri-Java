package com.mantarteknoloji.hibernateAndJpa.Business;

import java.util.List;

import com.mantarteknoloji.hibernateAndJpa.Entities.Product;

public interface IProductService {
	List<Product> getAll();
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int id);
}
