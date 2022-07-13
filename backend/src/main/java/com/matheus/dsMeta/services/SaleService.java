package com.matheus.dsMeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.dsMeta.entities.Sale;
import com.matheus.dsMeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSales(){
		return saleRepository.findAll();
	}

	public SaleRepository getSaleRepository() {
		return saleRepository;
	}

	public void setSaleRepository(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}
	

}
