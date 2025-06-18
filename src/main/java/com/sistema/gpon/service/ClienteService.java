package com.sistema.gpon.service;

import java.util.List;

import com.sistema.gpon.model.Cliente;

public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    List<Cliente> listarClientes();
    Cliente buscarPorDni(String dni);
    Cliente modificarCliente(Cliente cliente);
    boolean eliminarCliente(String dni);
}
