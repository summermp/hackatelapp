package com.app.hackatel.service;

import com.app.hackatel.dao.ConsultaDao;
import com.app.hackatel.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConsultaImpl implements ConsultaService {

    @Autowired
    private ConsultaDao consultaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Consulta> listaConsulta() {
        return consultaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Consulta consulta) {
        consultaDao.save(consulta);
    }

    @Override
    @Transactional
    public void eliminar(Consulta consulta) {

    }

    @Override
    @Transactional(readOnly = true)
    public Consulta buscarConsulta(Consulta consulta) {
        return null;
    }
}
