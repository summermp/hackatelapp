package com.app.hackatel.service;
import com.app.hackatel.domain.Consulta;
import java.util.List;

public interface ConsultaService{
    public List<Consulta> listaConsulta();

    public void guardar(Consulta consulta);

    public void eliminar(Consulta consulta);

    public Consulta buscarConsulta(Consulta consulta);
}
