package com.cruz.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String find() {
		return "Rest funcionando !";
	}

}
