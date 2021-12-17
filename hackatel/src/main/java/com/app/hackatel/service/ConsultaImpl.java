package com.app.hackatel.service;

import com.app.hackatel.dao.ConsultaDao;
import com.app.hackatel.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaImpl implements ConsultaService {

    @Autowired
    private ConsultaDao consultaDao;

    @Override
    public List<Consulta> listaConsulta() {
        return consultaDao.findAll();
    }

    @Override
    public void guardar(Consulta consulta) {
        consultaDao.save(consulta);
    }

    @Override
    public void eliminar(Consulta consulta) {

    }

    @Override
    public Consulta buscarConsulta(Consulta consulta) {
        return null;
    }
}
