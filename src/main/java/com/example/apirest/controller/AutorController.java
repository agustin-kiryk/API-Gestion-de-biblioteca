package com.example.apirest.controller;

import com.example.apirest.DTO.AutorDTO;
import com.example.apirest.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autores")
public class AutorController {

    private AutorService autorservice;
    @Autowired
    AutorController (AutorService autorservice){
        this.autorservice = autorservice;
    }

    @GetMapping
    ResponseEntity<List<AutorDTO>> findAll(){
        List<AutorDTO> autores = this.autorservice.findAll();
       return ResponseEntity.ok().body(autores);
    }

    @PostMapping
    ResponseEntity<AutorDTO> save(@RequestBody AutorDTO autor){
        AutorDTO autorSaved = this.autorservice.save(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(autorSaved);
    }

    @GetMapping("/{id}")
    ResponseEntity<AutorDTO> findById(@PathVariable Long id){
        AutorDTO autor = this.autorservice.findById(id);
        return ResponseEntity.ok(autor);
    }

    @PutMapping("/{id}")
    ResponseEntity<AutorDTO> update(@PathVariable Long id, @RequestBody AutorDTO autor){
        AutorDTO autorSaved= this.autorservice.update(id, autor);
        return ResponseEntity.ok(autorSaved);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id){
        this.autorservice.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }





}

