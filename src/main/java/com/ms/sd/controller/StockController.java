package com.ms.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.sd.dto.StockDTO;
import com.ms.sd.exception.StockException;
import com.ms.sd.service.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	@GetMapping("/stocks/{stockId}")
	public ResponseEntity<StockDTO> getStockById(@PathVariable("stockId") int stockId) throws StockException {
		return new ResponseEntity<StockDTO>(stockService.getStockById(stockId), HttpStatus.OK);
	}
}
