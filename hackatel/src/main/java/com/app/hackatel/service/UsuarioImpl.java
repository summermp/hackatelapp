package com.app.hackatel.service;
import com.app.hackatel.dao.UsuarioDao;
import com.app.hackatel.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsuarioImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listaUsuarios() {
        return usuarioDao.findAll();
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public Usuario buscarUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getId()).orElse(null);
    }
}
