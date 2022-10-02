package com.example.apirest.mapper;

import com.example.apirest.DTO.AutorDTO;
import com.example.apirest.entity.AutorEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AutorMapper {

    public List<AutorDTO> autorEntityList2DTOList(List<AutorEntity> entities) {
        List<AutorDTO> autores = new ArrayList<>();
        for (AutorEntity entity:entities) {
            autores.add(this.autorEntity2DTO(entity));
        }
        return autores;
    }

    public AutorEntity autorDTO2Entity(AutorDTO dto) {
        AutorEntity autorentity = new AutorEntity();
        autorentity.setNombre(dto.getNombre());
        autorentity.setApellido(dto.getApellido());
        autorentity.setBibliografia(dto.getBibliografia());
        return autorentity;
    }

    public AutorDTO autorEntity2DTO(AutorEntity entity) {
        AutorDTO autorDTO = new AutorDTO();
        autorDTO.setId(entity.getId());
        autorDTO.setNombre(entity.getNombre());
        autorDTO.setApellido(entity.getApellido());
        autorDTO.setBibliografia(entity.getBibliografia());
        return autorDTO;
    }
}
