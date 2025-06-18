package com.sistema.gpon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.gpon.model.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
}
