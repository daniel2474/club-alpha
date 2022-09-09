package com.tutorial.crud.repository;

import com.tutorial.crud.entity.RutinaEjercicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RutinaEjercicioRepository extends JpaRepository<RutinaEjercicio, Integer> {


}
