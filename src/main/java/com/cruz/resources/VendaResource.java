package com.cruz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cruz.domain.Venda;
import com.cruz.service.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaResource {
	
	@Autowired
    private VendaService vendaService;

	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Venda>> listarVendas() {
        return ResponseEntity.ok(vendaService.listarVendas());
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Venda> find(@PathVariable Integer id) {
		Venda obj = vendaService.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
