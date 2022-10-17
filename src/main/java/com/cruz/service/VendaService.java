package com.cruz.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruz.domain.Venda;
import com.cruz.domain.Vendedor;
import com.cruz.domain.DTOs.DetalhesVenda;
import com.cruz.domain.DTOs.VendaDTO;
import com.cruz.repositories.VendaRepository;
import com.cruz.service.exception.ObjectNotFoundException;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	public List<Venda> listarVendas() {
		return vendaRepository.findAll();
	}

	public Venda find(Integer id) {
		Optional<Venda> obj = vendaRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Venda não encontrada! Id: " + id + ", Tipo: " + Venda.class.getName()));
	}

	public Venda novaVenda(VendaDTO request) {
		Vendedor vendedor = new Vendedor();
		vendedor.setId(request.getVendedorId());

		Venda venda = new Venda();
		venda.setVendedor(vendedor);
		venda.setValor(request.getValor());

		return vendaRepository.save(venda);
	}

	public List<DetalhesVenda> detalhesVendedores(String startDate, String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		Period between = Period.between(start, end);

		return vendaRepository.detalhesVendas(start.atTime(LocalTime.MIN), end.atTime(LocalTime.MAX),
				(double) between.getDays());
	}

}