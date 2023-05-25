package com.ms.sd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.sd.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

}
