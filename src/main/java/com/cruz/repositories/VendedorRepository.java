package com.cruz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruz.domain.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
