package com.cruz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruz.domain.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
	
}
