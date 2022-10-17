package com.cruz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruz.domain.Vendedor;
import com.cruz.repositories.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
    private VendedorRepository vendedorRepository;
	
	public List<Vendedor> listarVendedores() {
		return vendedorRepository.findAll();
	}

}