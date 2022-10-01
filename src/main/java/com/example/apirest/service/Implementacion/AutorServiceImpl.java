package com.example.apirest.service.Implementacion;

import com.example.apirest.DTO.AutorDTO;
import com.example.apirest.service.AutorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {
    @Override
    public List<AutorDTO> findAll() {
        return null;
    }

    @Override
    public AutorDTO save(AutorDTO autor) {
        return null;
    }

    @Override
    public AutorDTO findById(Long id) {
        return null;
    }

    @Override
    public AutorDTO update(Long id, AutorDTO autor) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
