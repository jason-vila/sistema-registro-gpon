package com.sistema.gpon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gpon.model.Promocion;
import com.sistema.gpon.repository.PromocionRepository;
import com.sistema.gpon.service.PromocionService;

public class PromocionServiceImpl implements PromocionService {
	
	@Autowired
	private PromocionRepository promocionRepository;

	@Override
	public Promocion crearPromocion(Promocion promocion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promocion> listarPromociones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Promocion buscarPorId(Integer idPromocion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Promocion actualizarPromocion(Promocion promocion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPromocion(Integer idPromocion) {
		// TODO Auto-generated method stub
		return false;
	}
}
