package com.app.hackatel.service;

import com.app.hackatel.dao.FrecuenteDao;
import com.app.hackatel.domain.Frecuente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FrecuenteImpl implements FrecuenteService{

    @Autowired
    private FrecuenteDao frecuenteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Frecuente> listaFrecuente() {
        return frecuenteDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Frecuente frecuente) {
        frecuenteDao.save(frecuente);
    }

    @Override
    @Transactional
    public void eliminar(Frecuente frecuente) {
        frecuenteDao.delete(frecuente);
    }

    @Override
    @Transactional(readOnly = true)
    public Frecuente buscarFrecuente(Frecuente frecuente) {
        return frecuenteDao.findById(frecuente.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void actualizarFrecuente(Integer id) {
        frecuenteDao.actualizarCanal(id);
    }
}
