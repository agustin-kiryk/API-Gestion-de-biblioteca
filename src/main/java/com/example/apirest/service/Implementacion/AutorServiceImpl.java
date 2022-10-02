package com.example.apirest.service.Implementacion;

import com.example.apirest.DTO.AutorDTO;
import com.example.apirest.entity.AutorEntity;
import com.example.apirest.exception.ParamNotFound;
import com.example.apirest.mapper.AutorMapper;
import com.example.apirest.repository.AutorRepository;
import com.example.apirest.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {
    @Autowired
    AutorRepository autorRepository;
    @Autowired
    AutorMapper autorMapper;
    @Override
    public List<AutorDTO> findAll() {
        List<AutorEntity> entities = this.autorRepository.findAll();
        List<AutorDTO> result = this.autorMapper.autorListEntity2DTOList(entities);
        return result;
    }
    @Override
    public AutorDTO save(AutorDTO dto) {
        AutorEntity entity = this.autorMapper.autorDTO2Entity(dto);
        AutorEntity entitySaved = this.autorRepository.save(entity);
        AutorDTO result = this.autorMapper.autorEntity2DTO(entitySaved);
        return result;
    }

    @Override
    public AutorDTO findById(Long id) {
        AutorEntity entity = this.autorRepository.findById(id).orElseThrow(
                () -> new ParamNotFound("El ID del autor no existe"));
        AutorDTO dto = this.autorMapper.autorEntity2DTO(entity);
        return dto;
    }

    @Override
    public AutorDTO update(Long id, AutorDTO dto) {
        AutorEntity entity = this.autorRepository.findById(id).orElseThrow(
                () -> new ParamNotFound("El ID del autor no existe"));
        AutorEntity entityUpdate = autorMapper.autorDTO2Entity(dto);
        entityUpdate.setId(entity.getId());
        AutorEntity entitSaved = this.autorRepository.save(entityUpdate);
        AutorDTO result = this.autorMapper.autorEntity2DTO(entitSaved);
        return result;
    }

    @Override
    public void delete(Long id) {

    }
}
