package com.cruz.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cruz.domain.Venda;
import com.cruz.domain.DTOs.DetalhesVenda;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
	@Query("SELECT new com.cruz.domain.DTOs.DetalhesVenda(vr.nome, COUNT(va.valor), "
			+ "(SUM(va.valor) / CAST(:period AS double)))"
            + " FROM Venda va"
            + " JOIN va.vendedor vr"
            + " WHERE va.dataDaVenda BETWEEN :startDate AND :endDate"
            + " GROUP BY vr.nome"
    )
    List<DetalhesVenda> detalhesVendas(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate, @Param("period") Double period);

	
}
