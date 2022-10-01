package com.example.apirest.mapper;

import com.example.apirest.DTO.LocalidadDTO;
import com.example.apirest.entity.LocalidadEntity;
import com.example.apirest.entity.PersonaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class LocalidadMapper {

    public LocalidadEntity localidadDTO2Entity(LocalidadDTO dto) {
        LocalidadEntity localidadEntity = new LocalidadEntity();
        localidadEntity.setDenominacion(dto.getDenominacion());
        return localidadEntity;
    }
    public LocalidadDTO localidadEntity2DTO(LocalidadEntity entity) {
        LocalidadDTO localidadDTO = new LocalidadDTO();
        localidadDTO.setId(entity.getId());
        localidadDTO.setDenominacion(entity.getDenominacion());
        return localidadDTO;
    }
    public List<LocalidadDTO> localidadEntitiList2DTOList(List<LocalidadEntity> entities) {
        List<LocalidadDTO> localidades = new ArrayList<>();
        for (LocalidadEntity entity:entities) {
            localidades.add(this.localidadEntity2DTO(entity));
        }
        return localidades;
    }
}
