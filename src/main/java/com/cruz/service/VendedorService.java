package com.cruz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruz.domain.Vendedor;
import com.cruz.domain.DTOs.VendedorDTO;
import com.cruz.repositories.VendedorRepository;
import com.cruz.service.exception.ObjectNotFoundException;

@Service
public class VendedorService {

	@Autowired
    private VendedorRepository vendedorRepository;
	
	public List<Vendedor> listarVendedores() {
		return vendedorRepository.findAll();
	}
	
	public Vendedor find(Integer id) {
		Optional<Vendedor> obj = vendedorRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Vendedor não encontrado! Id: " + id + ", Tipo: " + Vendedor.class.getName()));
	}
	
	public Vendedor novoVendedor(VendedorDTO request) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(request.getNome());

        return vendedorRepository.save(vendedor);
    }


}