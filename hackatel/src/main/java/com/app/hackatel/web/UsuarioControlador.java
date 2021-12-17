package com.app.hackatel.web;

import com.app.hackatel.domain.Usuario;
import com.app.hackatel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public String incioUsuarios(Model model){
        var usuarios=usuarioService.listaUsuarios();
        model.addAttribute( "usuarios",usuarios);
        return "usuario";
    }

    @GetMapping("/agregarusuario")
    public String agregar(Usuario usuario){
        return "modificarusuario";
    }

    @PostMapping("/guardarusuario")
    public String guardar(Usuario usuario){
//        usuario.setIdusuario(3);
        usuarioService.guardar(usuario);
        return "redirect:/usuario";
    }
    @GetMapping("/editarusuario/{id}")//ya existe lo asocia
    public String editar(Usuario usuario, Model model){
        usuario =usuarioService.buscarUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "modificarusuario";
    }

    @GetMapping("/eliminarusuario/{id}")
    public String eliminar(Usuario usuario){
        usuarioService.eliminar(usuario);
        return "redirect:/usuario";
    }
}
