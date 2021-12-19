package com.app.hackatel.service;

import com.app.hackatel.dao.CanalDao;
import com.app.hackatel.domain.Canal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CanalImpl implements CanalService{

    @Autowired
    private CanalDao canalDao;

    @Override
    @Transactional(readOnly = true)
    public List<Canal> listaCanales() {
        return canalDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Canal canal) {
        canalDao.save(canal);
    }

    @Override
    @Transactional
    public void eliminar(Canal canal) {
        canalDao.delete(canal);
    }

    @Override
    @Transactional
    public void actualizarCanal(Integer id) {
        canalDao.actualizarCanal(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Canal buscarCanal(Canal canal) {
        return canalDao.findById(canal.getId()).orElse(null);
    }


}
