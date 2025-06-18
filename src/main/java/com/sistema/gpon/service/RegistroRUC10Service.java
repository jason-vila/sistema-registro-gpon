package com.sistema.gpon.service;

import java.util.List;

import com.sistema.gpon.model.RegistroRUC10;

public interface RegistroRUC10Service {
    RegistroRUC10 crearRegistro(RegistroRUC10 registro);
    List<RegistroRUC10> listarRegistros();
    RegistroRUC10 buscarPorId(Integer idRegistro);
    RegistroRUC10 actualizarRegistro(RegistroRUC10 registro);
    boolean eliminarRegistro(Integer idRegistro);
}
