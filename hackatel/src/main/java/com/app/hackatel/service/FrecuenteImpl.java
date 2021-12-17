package com.app.hackatel.service;

import com.app.hackatel.dao.FrecuenteDao;
import com.app.hackatel.domain.Frecuente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrecuenteImpl implements FrecuenteService{

    @Autowired
    private FrecuenteDao frecuenteDao;

    @Override
    public List<Frecuente> listaFrecuente() {
        return frecuenteDao.findAll();
    }

    @Override
    public void guardar(Frecuente frecuente) {
        frecuenteDao.save(frecuente);
    }

    @Override
    public void eliminar(Frecuente frecuente) {
        frecuenteDao.delete(frecuente);
    }

    @Override
    public Frecuente buscarFrecuente(Frecuente frecuente) {
        return frecuenteDao.findById(frecuente.getId()).orElse(null);
    }
}
