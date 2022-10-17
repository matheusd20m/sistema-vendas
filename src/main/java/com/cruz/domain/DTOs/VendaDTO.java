package com.cruz.domain.DTOs;

import java.math.BigDecimal;

import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VendaDTO {

	@Positive
    private BigDecimal valor;

	@JsonProperty("vendedor_id")
    private Integer vendedorId;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Integer vendedorId) {
        this.vendedorId = vendedorId;
    }
}