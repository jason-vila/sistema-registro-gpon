package com.sistema.gpon.service.impl;

import java.util.List;

import com.sistema.gpon.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gpon.model.Plan;
import com.sistema.gpon.repository.PlanRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlanRepository planRepository;

	@Override
	public Plan crearPlan(Plan plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plan> listarPlanes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan buscarPorId(Integer idPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan actualizarPlan(Plan plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPlan(Integer idPlan) {
		// TODO Auto-generated method stub
		return false;
	}
}
