package com.ms.sd.service;

import com.ms.sd.dto.StockDTO;
import com.ms.sd.exception.StockException;

public interface StockService {

	StockDTO getStockById(int stockId) throws StockException;
}
