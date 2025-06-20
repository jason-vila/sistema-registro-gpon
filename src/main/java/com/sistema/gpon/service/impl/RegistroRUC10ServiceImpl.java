package com.sistema.gpon.service.impl;

import java.util.List;

import com.sistema.gpon.service.RegistroRUC10Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gpon.model.RegistroRUC10;
import com.sistema.gpon.repository.RegistroRUC10Repository;
import org.springframework.stereotype.Service;

@Service
public class RegistroRUC10ServiceImpl implements RegistroRUC10Service {
	
	@Autowired
	private RegistroRUC10Repository registroRUC10Repository;

	@Override
	public RegistroRUC10 crearRegistro(RegistroRUC10 registro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistroRUC10> listarRegistros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroRUC10 buscarPorId(Integer idRegistro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroRUC10 actualizarRegistro(RegistroRUC10 registro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarRegistro(Integer idRegistro) {
		// TODO Auto-generated method stub
		return false;
	}
}
