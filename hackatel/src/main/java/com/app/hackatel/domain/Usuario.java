package com.app.hackatel.domain;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String clave;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="consultausuario",cascade = CascadeType.ALL)
    private List<Consulta> consulta;
}
