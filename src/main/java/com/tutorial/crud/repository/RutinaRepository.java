package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Rutina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RutinaRepository extends JpaRepository<Rutina, Integer> {


}
