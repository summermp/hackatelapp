package com.app.hackatel.dao;

import com.app.hackatel.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Integer> {

}
