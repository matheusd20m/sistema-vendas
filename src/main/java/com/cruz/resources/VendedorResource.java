package com.cruz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cruz.domain.Vendedor;
import com.cruz.domain.DTOs.VendedorDTO;
import com.cruz.service.VendedorService;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorResource {

	@Autowired
	private VendedorService vendedorService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Vendedor>> listarVendedores() {
		return ResponseEntity.ok(vendedorService.listarVendedores());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vendedor> find(@PathVariable Integer id) {
		Vendedor obj = vendedorService.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Vendedor> novoVendedor(@RequestBody VendedorDTO request) {
		return new ResponseEntity<>(vendedorService.novoVendedor(request), HttpStatus.CREATED);
	}

}
