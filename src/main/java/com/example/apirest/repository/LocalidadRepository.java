package com.example.apirest.repository;

import com.example.apirest.entity.LocalidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<LocalidadEntity, Long> {

}
