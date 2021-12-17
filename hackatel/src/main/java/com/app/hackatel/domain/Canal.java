package com.app.hackatel.domain;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="canal")
public class Canal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private int contador;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpagina",insertable = true, updatable = true, nullable = false)
    private Pagina canalpagina;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="canalconsulta",cascade = CascadeType.ALL)
    private List<Consulta> consulta;

}
