package com.sistema.gpon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gpon.model.Usuario;
import com.sistema.gpon.repository.UsuarioRepository;
import com.sistema.gpon.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorId(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}
}
