package com.LegendsClash.project.controllers;

import com.LegendsClash.project.DTO.UpdatePersonaje;
import com.LegendsClash.project.models.Personaje;
import com.LegendsClash.project.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
@CrossOrigin(origins = "*")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public Personaje registrarPersonaje(@RequestBody Personaje personaje) {
        return personajeService.guardarPersonaje(personaje);
    }

    @GetMapping("/getPersonajes")
    public List<Personaje> getPersonajes() {
        return personajeService.getPersonajes();
    }

    @GetMapping("/getPersonaje/{id}")   
    public Personaje obtenerPersonaje(@PathVariable Long id) {
        return personajeService.obtenerPersonajePorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Personaje obtenerPersonajePorNombre(@PathVariable String nombre) {
        return personajeService.obtenerPersonajePorNombre(nombre);
    }

    @PatchMapping("/updatePersonaje")
    public void updatePersonaje (@RequestBody UpdatePersonaje personaje) {
        personajeService.updatePersonaje(personaje);
    }
}
