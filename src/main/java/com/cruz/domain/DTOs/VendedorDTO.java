package com.cruz.domain.DTOs;

import javax.validation.constraints.NotBlank;

public class VendedorDTO {

	@NotBlank
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}