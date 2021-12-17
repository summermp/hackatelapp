package com.app.hackatel.web;

import com.app.hackatel.domain.Consulta;
import com.app.hackatel.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsultaControlador {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/consulta")
    public String incioConsultas(Model model){
        var consultas=consultaService.listaConsulta();
        model.addAttribute( "consultas",consultas);
        return "consulta";
    }

    @GetMapping("/agregarconsulta")
    public String agregar(Consulta consulta){
        return "modificarconsulta";
    }

    @PostMapping("/guardarconsulta")
    public String guardar(Consulta consulta){
//        consulta.setIdusuario(3);
        consultaService.guardar(consulta);
        return "redirect:/consulta";
    }
    @GetMapping("/editarconsulta/{id}")//ya existe lo asocia
    public String editar(Consulta consulta, Model model){
        consulta=consultaService.buscarConsulta(consulta);
        model.addAttribute("consulta",consulta);
        return "modificarconsulta";
    }

    @GetMapping("/eliminarconsulta/{id}")
    public String eliminar(Consulta consulta){
        consultaService.eliminar(consulta);
        return "redirect:/consulta";
    }

}
