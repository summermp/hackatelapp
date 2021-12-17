package com.app.hackatel.service;

import com.app.hackatel.domain.Canal;

import java.util.List;

public interface CanalService {

    public List<Canal> listaCanales();

    public void guardar(Canal canal);

    public void eliminar(Canal canal);

    public Canal buscarCanal(Canal canal);

}
