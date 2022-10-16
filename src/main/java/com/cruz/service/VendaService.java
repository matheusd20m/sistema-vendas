package com.cruz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruz.domain.Venda;
import com.cruz.repositories.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	public List<Venda> listarVendas() {
		return vendaRepository.findAll();
	}

}