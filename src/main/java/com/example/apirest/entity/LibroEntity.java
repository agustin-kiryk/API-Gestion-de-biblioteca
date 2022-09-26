package com.example.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LibroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "paginas")
    private Long paginas;

    @Column(name = "genero")
    private String genero;

    private boolean deleted = Boolean.FALSE;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private Set<AutorEntity> autores;


}
