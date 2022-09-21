package com.example.apirest.service.Implementacion;

import com.example.apirest.DTO.PersonaDTO;
import com.example.apirest.entity.PersonaEntity;
import com.example.apirest.mapper.PersonaMapper;
import com.example.apirest.repository.PersonaRepository;
import com.example.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PersonaMapper personaMapper;


    //Se usa @Autowired que reemplaza al constructor
    /* public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }*/
    @Override
    public List<PersonaDTO> findAll() {
        List<PersonaEntity> entities = personaRepository.findAll();
        List<PersonaDTO> result = personaMapper.personaEntityList2DTOList(entities);
        return result;
    }

    @Override
    public PersonaDTO findById(Long id) {
        return null;
    }

    @Override
    public PersonaDTO save(PersonaDTO dto) {
        PersonaEntity entity = personaMapper.personaDTO2Entity(dto);
        PersonaEntity entitysaved = personaRepository.save(entity);
        PersonaDTO result = personaMapper.personaEntity2DTO(entitysaved);
        return result;
    }

    @Override
    public PersonaDTO update(Long id, PersonaDTO persona) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
