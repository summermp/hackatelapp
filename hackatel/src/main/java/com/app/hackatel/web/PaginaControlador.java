package com.app.hackatel.web;

import com.app.hackatel.domain.Pagina;
import com.app.hackatel.service.PaginaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PaginaControlador {

    @Autowired
    private PaginaService paginaService;

    @GetMapping("/pagina")
    public String incioPaginas(Model model){
        var paginas=paginaService.listaPaginas();
        model.addAttribute( "paginas",paginas);
        return "pagina";
    }

    @GetMapping("/agregarpagina")
    public String agregar(Pagina pagina){
        return "modificarpagina";
    }

    @PostMapping("/guardarpagina")
    public String guardar(Pagina pagina){
//        pagina.setIdusuario(3);
        paginaService.guardar(pagina);
        return "redirect:/pagina";
    }
    @GetMapping("/editarpagina/{id}")//ya existe lo asocia
    public String editar(Pagina pagina, Model model){
        pagina =paginaService.buscarPagina(pagina);
        model.addAttribute("pagina", pagina);
        return "modificarpagina";
    }

    @GetMapping("/eliminarpagina/{id}")
    public String eliminar(Pagina pagina){
        paginaService.eliminar(pagina);
        return "redirect:/pagina";
    }

}
