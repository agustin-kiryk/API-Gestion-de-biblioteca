package com.example.apirest.controller;

import com.example.apirest.DTO.LocalidadDTO;
import com.example.apirest.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("localidades")
public class LocalidadController {


    private LocalidadService localidadService;
    @Autowired
    LocalidadController(LocalidadService localidadservice){
        this.localidadService = localidadservice;
    }


    @GetMapping
    public ResponseEntity<List<LocalidadDTO>> findAll(){
        List<LocalidadDTO> localidades = this.localidadService.findAll();
        return ResponseEntity.ok().body(localidades);
    }

    @PostMapping
    public ResponseEntity<LocalidadDTO> save(@RequestBody LocalidadDTO localidad){
        LocalidadDTO localidadSaved = this.localidadService.save(localidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(localidadSaved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocalidadDTO> findById(@PathVariable Long id){
        LocalidadDTO  localidad = this.localidadService.findById(id);
        return ResponseEntity.ok(localidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LocalidadDTO> update(@PathVariable Long id, @RequestBody LocalidadDTO localidad){
        LocalidadDTO result = this.localidadService.update(id, localidad);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.localidadService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
