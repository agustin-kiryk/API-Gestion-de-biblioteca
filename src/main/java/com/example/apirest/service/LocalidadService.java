package com.example.apirest.service;

import com.example.apirest.DTO.LocalidadDTO;

import java.util.List;

public interface LocalidadService {
    List<LocalidadDTO> findAll();

    LocalidadDTO save(LocalidadDTO localidad);

    LocalidadDTO findById(Long id);

    LocalidadDTO update(Long id, LocalidadDTO localidad);

    void delete(Long id);
}
