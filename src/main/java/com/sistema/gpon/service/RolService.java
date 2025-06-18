package com.sistema.gpon.service;

import java.util.List;

import com.sistema.gpon.model.Rol;

public interface RolService {
    Rol crearRol(Rol rol);
    List<Rol> listarRoles();
    Rol buscarPorId(Integer idRol);
    Rol modificarRol(Rol rol);
    boolean eliminarRol(Integer idRol);
}
