package com.app.hackatel.web;

import com.app.hackatel.domain.Frecuente;
import com.app.hackatel.service.FrecuenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class FrecuenteControlador {

    @Autowired
    private FrecuenteService frecuenteService;

    @GetMapping("/frecuente")
    public String incioFrecuentes(Model model){
        var frecuentes=frecuenteService.listaFrecuente();
        model.addAttribute( "frecuentes",frecuentes);
        return "frecuente";
    }

    @GetMapping("/agregarfrecuente")
    public String agregar(Frecuente frecuente){
        return "modificarfrecuente";
    }

    @PostMapping("/guardarfrecuente")
    public String guardar(Frecuente frecuente){
//        frecuente.setIdusuario(3);
        frecuenteService.guardar(frecuente);
        return "redirect:/frecuente";
    }
    @GetMapping("/editarfrecuente/{id}")//ya existe lo asocia
    public String editar(Frecuente frecuente, Model model){
        frecuente=frecuenteService.buscarFrecuente(frecuente);
        model.addAttribute("frecuente",frecuente);
        return "modificarfrecuente";
    }

    @GetMapping("/eliminarfrecuente/{id}")
    public String eliminar(Frecuente frecuente){
        frecuenteService.eliminar(frecuente);
        return "redirect:/frecuente";
    }

}
