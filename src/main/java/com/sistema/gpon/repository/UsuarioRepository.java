package com.sistema.gpon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.gpon.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
