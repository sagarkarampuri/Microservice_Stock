package com.ms.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.sd.dto.StockDTO;
import com.ms.sd.entity.Stock;
import com.ms.sd.exception.StockException;
import com.ms.sd.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public StockDTO getStockById(int stockId) throws StockException {
		Stock stock = stockRepository.findById(stockId)
				.orElseThrow(() -> new StockException("stock not found with stock id : " + stockId));
		return StockDTO.createDTO(stock);
	}

}
