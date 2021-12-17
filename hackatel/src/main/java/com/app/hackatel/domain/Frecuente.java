package com.app.hackatel.domain;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="frecuente")
public class Frecuente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String pregunta;

    private int contador;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpagina",insertable = true, updatable = true, nullable = false)
    private Pagina paginafrecuente;
}
