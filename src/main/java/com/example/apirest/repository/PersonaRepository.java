package com.example.apirest.repository;

import com.example.apirest.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
