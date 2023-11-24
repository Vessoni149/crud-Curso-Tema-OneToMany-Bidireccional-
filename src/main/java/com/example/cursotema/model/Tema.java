
package com.example.cursotema.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_tema;
    private String nombre;
    private String descripcion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_asociado", referencedColumnName="id_curso")
    @JsonBackReference  //para evitar recursion infinita al acer un get de Tema cuando los temas ya están asociados a un curso.
    private Curso curso;
}
 