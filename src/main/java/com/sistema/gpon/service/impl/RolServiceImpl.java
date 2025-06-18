package com.sistema.gpon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gpon.model.Rol;
import com.sistema.gpon.repository.RolRepository;
import com.sistema.gpon.service.RolService;

public class RolServiceImpl implements RolService {
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public Rol crearRol(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> listarRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol buscarPorId(Integer idRol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol modificarRol(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarRol(Integer idRol) {
		// TODO Auto-generated method stub
		return false;
	}
}
