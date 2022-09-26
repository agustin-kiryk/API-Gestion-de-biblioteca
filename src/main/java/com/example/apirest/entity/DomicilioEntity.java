package com.example.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql="UPDATE domicilio SET deleted= true WHERE id=?")
@Where(clause = "deleted=false")

public class DomicilioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    private boolean deleted=Boolean.FALSE;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private LocalidadEntity localidad;





}
