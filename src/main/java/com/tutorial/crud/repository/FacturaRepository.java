package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Factura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

	Optional<Factura> findByRecibo(String recibo);
	List<Factura> findByIdCliente(int idCliente);

}
