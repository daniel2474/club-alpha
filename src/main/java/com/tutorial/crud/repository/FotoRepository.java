package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Foto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FotoRepository extends JpaRepository<Foto, Integer> {

}
