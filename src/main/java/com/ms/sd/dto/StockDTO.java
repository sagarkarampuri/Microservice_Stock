package com.ms.sd.dto;

import com.ms.sd.entity.Stock;

public class StockDTO {

	private int stockId;
	private String company;
	private int faceValue;
	private double price;

	public static StockDTO createDTO(Stock stock) {
		StockDTO stockDTO = new StockDTO();
		stockDTO.setStockId(stock.getStockId());
		stockDTO.setCompany(stock.getCompany());
		stockDTO.setFaceValue(stock.getFaceValue());
		stockDTO.setPrice(stock.getPrice());
		return stockDTO;
	}

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
