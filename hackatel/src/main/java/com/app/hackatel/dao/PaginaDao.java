package com.app.hackatel.dao;

import com.app.hackatel.domain.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PaginaDao extends JpaRepository<Pagina, Integer> {
    @Transactional
    @Modifying
    @Query(value="update Pagina set vista=vista+1 where id=:id",nativeQuery = true)
    void actualizarPagina(@Param("id") Integer id);
}
