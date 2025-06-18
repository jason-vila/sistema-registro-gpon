package com.sistema.gpon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.gpon.model.Cliente;
import com.sistema.gpon.repository.ClienteRepository;
import com.sistema.gpon.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
    @Autowired
    private ClienteRepository clienteRepository;

	@Override
	public Cliente crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Cliente modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarCliente(String dni) {
		// TODO Auto-generated method stub
		return false;		
	}
}
