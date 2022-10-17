package com.cruz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cruz.domain.Vendedor;
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

}
