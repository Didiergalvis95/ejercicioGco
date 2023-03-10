package com.example.ejerciciopracticoback.repositories;

import com.example.ejerciciopracticoback.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
