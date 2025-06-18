package com.sistema.gpon.service;

import java.util.List;

import com.sistema.gpon.model.Usuario;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario buscarPorId(Integer idUsuario);
    Usuario modificarUsuario(Usuario usuario);
    boolean eliminarUsuario(Integer idUsuario);
}
