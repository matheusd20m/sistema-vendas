package com.cruz.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime dataDaVenda;

	private BigDecimal valor;

	public Venda() {
	}

	public Venda(Integer id, LocalDateTime dataDaVenda, BigDecimal valor) {
		this.id = id;
		this.dataDaVenda = dataDaVenda;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataDaVenda() {
		return dataDaVenda;
	}

	public void setDataDaVenda(LocalDateTime dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Venda venda = (Venda) o;
		return Objects.equals(id, venda.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}