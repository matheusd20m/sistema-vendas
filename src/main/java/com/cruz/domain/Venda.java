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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

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

	@ManyToOne
	@JoinColumns({
		    @JoinColumn(name = "vendedor_id",  referencedColumnName="id"),
		    @JoinColumn(name = "nome_vendedor",referencedColumnName="nome")
		    })
	private Vendedor vendedor;

	public Venda() {
	}

	public Venda(Integer id, LocalDateTime dataDaVenda, BigDecimal valor, Vendedor vendedor) {
		this.id = id;
		this.dataDaVenda = dataDaVenda;
		this.valor = valor;
		this.setVendedor(vendedor);
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
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