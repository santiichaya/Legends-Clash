package com.LegendsClash.project.controllers;

import com.LegendsClash.project.models.Personaje;
import com.LegendsClash.project.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public Personaje registrarPersonaje(@RequestBody Personaje personaje) {
        return personajeService.guardarPersonaje(personaje);
    }

    @GetMapping("/{id}")
    public Personaje obtenerPersonaje(@PathVariable Long id) {
        return personajeService.obtenerPersonajePorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Personaje obtenerPersonajePorNombre(@PathVariable String nombre) {
        return personajeService.obtenerPersonajePorNombre(nombre);
    }
}
