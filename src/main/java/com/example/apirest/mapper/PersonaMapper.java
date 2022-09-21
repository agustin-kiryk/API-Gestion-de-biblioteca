package com.example.apirest.mapper;

import com.example.apirest.DTO.PersonaDTO;
import com.example.apirest.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaMapper {

    public PersonaEntity personaDTO2Entity(PersonaDTO dto){
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNombre(dto.getNombre());
        personaEntity.setApellido(dto.getApellido());
        personaEntity.setDni(dto.getDni());
        return personaEntity;
    }

    public PersonaDTO personaEntity2DTO(PersonaEntity entity){
        PersonaDTO dto = new PersonaDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setApellido(entity.getApellido());
        dto.setDni(entity.getDni());
        return dto;
    }


   public List<PersonaDTO> personaEntityList2DTOList(List<PersonaEntity> entities){
        List<PersonaDTO> dtos = new ArrayList<>();
        for (PersonaEntity entity : entities){
            dtos.add(this.personaEntity2DTO(entity));
        }
        return dtos;
    }
}
