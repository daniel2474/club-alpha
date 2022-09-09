package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Banda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandaRepository extends JpaRepository<Banda, Integer> {

}
