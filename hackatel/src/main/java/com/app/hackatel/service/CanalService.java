package com.app.hackatel.service;

import com.app.hackatel.domain.Canal;

import java.util.List;

public interface CanalService {

    List<Canal> listaCanales();

    void guardar(Canal canal);

    void eliminar(Canal canal);

    Canal buscarCanal(Canal canal);

    void actualizarCanal(Integer id);

}
