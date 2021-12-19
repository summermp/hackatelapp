package com.app.hackatel.dao;

import com.app.hackatel.domain.Frecuente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FrecuenteDao extends JpaRepository<Frecuente,Integer> {
    @Transactional
    @Modifying
    @Query(value="update Frecuente set contador=contador+1 where id=:id",nativeQuery = true)
    void actualizarCanal(@Param("id") Integer id);
}

