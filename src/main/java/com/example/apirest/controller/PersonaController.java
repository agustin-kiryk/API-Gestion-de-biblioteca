package com.example.apirest.controller;

import com.example.apirest.DTO.PersonaDTO;
import com.example.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
//traer todos//
    @GetMapping
    ResponseEntity<List<PersonaDTO>> findAll(){
        List<PersonaDTO> personas = personaService.findAll();
        return ResponseEntity.ok().body(personas);
    }

//guardar//

    @PostMapping
    ResponseEntity<PersonaDTO> save(@RequestBody PersonaDTO persona){
        PersonaDTO personasaved = personaService.save(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personasaved);
    }






}
