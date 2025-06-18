package com.sistema.gpon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.gpon.model.Sector;

public interface SectorRepository extends JpaRepository<Sector, Integer> {
}
