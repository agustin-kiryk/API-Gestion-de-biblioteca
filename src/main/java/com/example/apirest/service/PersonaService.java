package com.example.apirest.service;

import com.example.apirest.DTO.PersonaDTO;

import java.util.List;

public interface PersonaService {

    List<PersonaDTO> findAll();
    PersonaDTO findById(Long id);
    PersonaDTO save(PersonaDTO dto);
    PersonaDTO update(Long id, PersonaDTO persona);
    void delete(Long id);

}
