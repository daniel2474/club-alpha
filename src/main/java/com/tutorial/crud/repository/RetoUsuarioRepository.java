package com.tutorial.crud.repository;

import com.tutorial.crud.entity.RetoUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RetoUsuarioRepository extends JpaRepository<RetoUsuario, UUID> {

	Optional<List<RetoUsuario>> findByActivo(boolean activo);


}
