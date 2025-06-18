package com.sistema.gpon.service;

import java.util.List;

import com.sistema.gpon.model.Promocion;

public interface PromocionService {
    Promocion crearPromocion(Promocion promocion);
    List<Promocion> listarPromociones();
    Promocion buscarPorId(Integer idPromocion);
    Promocion actualizarPromocion(Promocion promocion);
    boolean eliminarPromocion(Integer idPromocion);
}
