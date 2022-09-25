package com.example.apirest.controller;

import com.example.apirest.DTO.PersonaDTO;
import com.example.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
//traer todos//
    @GetMapping
    public ResponseEntity<List<PersonaDTO>> findAll(){
        List<PersonaDTO> personas = personaService.findAll();
        return ResponseEntity.ok().body(personas);
    }

//guardar//

    @PostMapping
    public ResponseEntity<PersonaDTO> save(@RequestBody PersonaDTO persona){
        PersonaDTO personasaved = personaService.save(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personasaved);
    }

    //traer por id//

    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO> findById(@Valid @PathVariable Long id){
        PersonaDTO persona = personaService.findById(id);
        return ResponseEntity.ok(persona);

    }

    //Update//
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO> update(@Valid @PathVariable Long id , @RequestBody PersonaDTO persona){
        PersonaDTO result = personaService.update(id,persona);
        return ResponseEntity.ok(result);
    }

    //Delete//
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@Valid @PathVariable Long id){
        this.personaService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }






}
