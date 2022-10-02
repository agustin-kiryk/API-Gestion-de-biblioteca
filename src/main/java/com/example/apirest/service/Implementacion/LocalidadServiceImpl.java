package com.example.apirest.service.Implementacion;

import com.example.apirest.DTO.LocalidadDTO;
import com.example.apirest.entity.LocalidadEntity;
import com.example.apirest.exception.ParamNotFound;
import com.example.apirest.mapper.LocalidadMapper;
import com.example.apirest.repository.LocalidadRepository;
import com.example.apirest.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
    @Autowired
    private LocalidadMapper localidadMapper;
    @Override
    public List<LocalidadDTO> findAll() {
        List<LocalidadEntity> entities = this.localidadRepository.findAll();
        List<LocalidadDTO> result = localidadMapper.localidadEntitiList2DTOList(entities);
        return result;
    }

    @Override
    public LocalidadDTO save(LocalidadDTO dto) {
        LocalidadEntity entity = localidadMapper.localidadDTO2Entity(dto);
        LocalidadEntity entitySaved = this.localidadRepository.save(entity);
        LocalidadDTO result = localidadMapper.localidadEntity2DTO(entitySaved);
        return result;
    }
    @Override
    public LocalidadDTO findById(Long id) {
        LocalidadEntity entity = this.localidadRepository.findById(id).orElseThrow(
                ()-> new ParamNotFound("El ID de la localidad no existe"));
        LocalidadDTO dto = localidadMapper.localidadEntity2DTO(entity);
        return dto;
    }
    @Override
    public LocalidadDTO update(Long id, LocalidadDTO dto) {
        LocalidadEntity entityOld = this.localidadRepository.findById(id).orElseThrow(
                ()-> new ParamNotFound("El ID de localidad no existe"));
        LocalidadEntity entityUpdate = localidadMapper.localidadDTO2Entity(dto);
        entityUpdate.setId(dto.getId());
        LocalidadEntity entitySaved = localidadRepository.save(entityUpdate);
        LocalidadDTO result = localidadMapper.localidadEntity2DTO(entitySaved);
        return result;
    }
    @Override
    public void delete(Long id) {
        LocalidadEntity entity = this.localidadRepository.findById(id).orElseThrow(
                ()-> new ParamNotFound("El ID de la localidad no existe"));
        this.localidadRepository.delete(entity);
    }
}
