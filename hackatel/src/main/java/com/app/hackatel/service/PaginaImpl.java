package com.app.hackatel.service;

import com.app.hackatel.dao.PaginaDao;
import com.app.hackatel.domain.Pagina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginaImpl implements PaginaService{

    @Autowired
    private PaginaDao paginaDao;

    @Override
    public List<Pagina> listaPaginas() {
        return paginaDao.findAll();
    }

    @Override
    public void guardar(Pagina pagina) {
        paginaDao.save(pagina);
    }

    @Override
    public void eliminar(Pagina pagina) {
        paginaDao.delete(pagina);
    }

    @Override
    public Pagina buscarPagina(Pagina pagina) {
        return paginaDao.findById(pagina.getId()).orElse(null);
    }
}
