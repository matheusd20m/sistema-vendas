package com.cruz.domain.DTOs;

import java.math.BigDecimal;

public class VendaDTO {

    
    private BigDecimal valor;

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