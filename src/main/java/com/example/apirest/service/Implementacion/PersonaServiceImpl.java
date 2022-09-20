package com.example.apirest.service.Implementacion;

import com.example.apirest.DTO.PersonaDTO;
import com.example.apirest.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Override
    public List<PersonaDTO> findAll() {
        return null;
    }

    @Override
    public PersonaDTO findById(Long id) {
        return null;
    }

    @Override
    public PersonaDTO Save(Long id) {
        return null;
    }

    @Override
    public PersonaDTO update(Long id, PersonaDTO persona) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
