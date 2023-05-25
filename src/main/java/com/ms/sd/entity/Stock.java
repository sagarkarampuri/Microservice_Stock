package com.ms.sd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stock {

	@Id
	private int stockId;
	private String company;
	private int faceValue;
	private double price;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
