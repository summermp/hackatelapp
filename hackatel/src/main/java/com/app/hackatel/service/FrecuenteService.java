package com.app.hackatel.service;

import com.app.hackatel.domain.Frecuente;

import java.util.List;

public interface FrecuenteService {
    public List<Frecuente> listaFrecuente();

    public void guardar(Frecuente consulta);

    public void eliminar(Frecuente consulta);

    public Frecuente buscarFrecuente(Frecuente consulta);
}
