package com.app.hackatel.domain;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="pagina")
public class Pagina implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="canalpagina",cascade = CascadeType.ALL)
    private List<Canal> canal;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="paginafrecuente",cascade = CascadeType.ALL)
    private List<Frecuente> frecuente;

}
