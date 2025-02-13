package com.mantarteknoloji.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mantarteknoloji.hibernateAndJpa.DataAccess.IProductDal;
import com.mantarteknoloji.hibernateAndJpa.Entities.Product;

@Service
public class ProductManager implements IProductService{

	private IProductDal productDal;
	
	@Autowired
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}

	@Override
	@Transactional
	public List<Product> getAll() {
		return this.productDal.getAll();
	}

	@Override
	@Transactional
	public void add(Product product) {
		this.productDal.add(product);
		
	}

	@Override
	@Transactional
	public void update(Product product) {
		this.productDal.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		this.productDal.delete(product);
		
	}

	@Override
	@Transactional
	public Product getById(int id) {
		return this.productDal.getById(id);
	}

}
