package com.ms.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.ms.sd.dto.StockDTO;
import com.ms.sd.entity.Stock;
import com.ms.sd.exception.StockException;
import com.ms.sd.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private Environment environment;

	@Override
	public StockDTO getStockById(int stockId) throws StockException {
		Stock stock = stockRepository.findById(stockId).orElseThrow(
				() -> new StockException(environment.getProperty("StockService.stock_not_found") + stockId));
		return StockDTO.createDTO(stock);
	}

}
