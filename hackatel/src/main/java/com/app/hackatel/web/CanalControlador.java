package com.app.hackatel.web;
import com.app.hackatel.domain.Canal;
import com.app.hackatel.service.CanalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CanalControlador {

    @Autowired
    private CanalService canalService;

    @GetMapping("/canal")
    public String incioCanals(Model model){
        var canals=canalService.listaCanales();
        model.addAttribute( "canals",canals);
        return "canal";
    }

    @GetMapping("/agregarcanal")
    public String agregar(Canal canal){
        return "modificarcanal";
    }

    @PostMapping("/guardarcanal")
    public String guardar(Canal canal){
//        canal.setIdusuario(3);
        canalService.guardar(canal);
        return "redirect:/canal";
    }
    @GetMapping("/editarcanal/{id}")//ya existe lo asocia
    public String editar(Canal canal, Model model){
        canal=canalService.buscarCanal(canal);
        model.addAttribute("canal",canal);
        return "modificarcanal";
    }

    @GetMapping("/eliminarcanal/{id}")
    public String eliminar(Canal canal){
        canalService.eliminar(canal);
        return "redirect:/canal";
    }

    @PostMapping("/actualizarcanal")
    public String actualizarcanal(@RequestParam("idcanal") String idcanal, Model model){
        canalService.actualizarCanal(Integer.parseInt(idcanal));
        return "redirect:/canal";
    }

}
