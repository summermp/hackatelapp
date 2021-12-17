package com.app.hackatel.service;

import com.app.hackatel.dao.CanalDao;
import com.app.hackatel.domain.Canal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CanalImpl implements CanalService{

    @Autowired
    private CanalDao canalDao;

    @Override
    public List<Canal> listaCanales() {
        return canalDao.findAll();
    }

    @Override
    public void guardar(Canal canal) {
        canalDao.save(canal);
    }

    @Override
    public void eliminar(Canal canal) {
        canalDao.delete(canal);
    }

    @Override
    public Canal buscarCanal(Canal canal) {
        return canalDao.findById(canal.getId()).orElse(null);
    }

}
