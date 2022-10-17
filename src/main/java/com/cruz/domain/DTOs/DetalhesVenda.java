package com.cruz.domain.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesVenda {

    private String nome;

    @JsonProperty("total_de_vendas")
    private long totalDeVendas;

    @JsonProperty("media_diaria")
    private double mediaDiaria;

    public DetalhesVenda(String nome, long totalDeVendas, double mediaDiaria) {
        this.nome = nome;
        this.totalDeVendas = totalDeVendas;
        this.mediaDiaria = mediaDiaria;
    }

    public DetalhesVenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(long totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public double getMediaDiaria() {
        return mediaDiaria;
    }

    public void setMediaDiaria(double mediaDiaria) {
        this.mediaDiaria = mediaDiaria;
    }
}