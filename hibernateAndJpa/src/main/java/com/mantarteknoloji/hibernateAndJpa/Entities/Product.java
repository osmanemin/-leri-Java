package com.mantarteknoloji.hibernateAndJpa.Entities;


import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "stock_amount")
	private int stockAmount;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	public Product() {}
	
	public Product(int id, String name, int stockAmount, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.stockAmount = stockAmount;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
