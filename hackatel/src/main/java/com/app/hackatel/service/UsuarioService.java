package com.app.hackatel.service;
import com.app.hackatel.domain.Usuario;
import java.util.List;
public interface UsuarioService {
    public List<Usuario> listaUsuarios();

    public void guardar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public Usuario buscarUsuario(Usuario usuario);
}
