package com.matheus.dsMeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.dsMeta.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{


}
