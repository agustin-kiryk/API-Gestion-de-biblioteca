package com.example.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "localidad")
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql="UPDATE localidad SET deleted= true WHERE id=?")
@Where(clause = "deleted=false")

public class LocalidadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    private boolean deleted=Boolean.FALSE;

}
