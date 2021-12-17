package com.app.hackatel.domain;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="consulta")
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String mensaje;

    private String tiempoinicio;

    private String tiempofin;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcanal",insertable = true, updatable = true, nullable = false)
    private Canal canalconsulta;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idusuario",insertable = true, updatable = true, nullable = false)
    private Usuario consultausuario;
}
