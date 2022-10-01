package com.example.apirest.service;

import com.example.apirest.DTO.AutorDTO;

import java.util.List;

public interface AutorService {
    List<AutorDTO> findAll();

    AutorDTO save(AutorDTO autor);

    AutorDTO findById(Long id);

    AutorDTO update(Long id, AutorDTO autor);

    void delete(Long id);
}
