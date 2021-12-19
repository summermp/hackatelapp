package com.app.hackatel.service;

import com.app.hackatel.dao.PaginaDao;
import com.app.hackatel.domain.Pagina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaginaImpl implements PaginaService{

    @Autowired
    private PaginaDao paginaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pagina> listaPaginas() {
        return paginaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Pagina pagina) {
        paginaDao.save(pagina);
    }

    @Override
    @Transactional
    public void eliminar(Pagina pagina) {
        paginaDao.delete(pagina);
    }

    @Override
    @Transactional(readOnly = true)
    public Pagina buscarPagina(Pagina pagina) {
        return paginaDao.findById(pagina.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void actualizarPagina(Integer id) {
        paginaDao.actualizarPagina(id);
    }
}
