package com.sistema.gpon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.gpon.model.RegistroRUC10;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRUC10Repository extends JpaRepository<RegistroRUC10, Integer> {
}
