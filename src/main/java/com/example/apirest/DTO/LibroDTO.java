package com.example.apirest.DTO;

import com.example.apirest.entity.AutorEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class LibroDTO {
    private Long id;
    private String titulo;
    private LocalDate fecha;
    private Long paginas;
    private String genero;
    private List<AutorDTO> autores;
}
