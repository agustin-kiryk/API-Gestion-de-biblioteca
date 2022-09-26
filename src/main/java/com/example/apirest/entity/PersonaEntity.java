package com.example.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql="UPDATE persona SET deleted= true WHERE id=?")
@Where(clause = "deleted=false")

public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private String dni;

    private boolean deleted=Boolean.FALSE;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    DomicilioEntity domicilio;

    @OneToMany
    @JoinTable(
           name = "persona_libro",
           joinColumns = @JoinColumn(name = "persona_id"),
           inverseJoinColumns = @JoinColumn(name = "libro_id")
   )
    private List<LibroEntity> libros = new ArrayList<>();

}
