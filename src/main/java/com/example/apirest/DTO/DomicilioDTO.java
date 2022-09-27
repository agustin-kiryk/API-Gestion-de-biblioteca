package com.example.apirest.DTO;

import com.example.apirest.entity.LocalidadEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomicilioDTO {

    private Long id;
    private String calle;
    private Integer numero;
    private LocalidadEntity localidad;
}
