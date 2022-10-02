package com.example.apirest.DTO;

import com.example.apirest.entity.DomicilioEntity;
import com.example.apirest.entity.LibroEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class PersonaDTO {

    private Long id;
    @NotEmpty(message = "EL nombre no puede estar vacio, por favor ingrese uno")
    private String nombre;
    @NotEmpty(message = "El apellido no puede estar vacio, por favor ingrese uno")
    private String apellido;
    private String dni;
    private DomicilioEntity domicilio;
    private List<LibroDTO> libros;


}
