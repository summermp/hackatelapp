package com.app.hackatel.service;

import com.app.hackatel.domain.Pagina;

import java.util.List;

public interface PaginaService {
    public List<Pagina> listaPaginas();

    public void guardar(Pagina pagina);

    public void eliminar(Pagina pagina);

    public Pagina buscarPagina(Pagina pagina);

    void actualizarPagina(Integer id);
}
