package com.LegendsClash.project.services;

import com.LegendsClash.project.models.Personaje;
import com.LegendsClash.project.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public Personaje guardarPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public Personaje obtenerPersonajePorId(Long id) {
        return personajeRepository.findById(id).orElse(null);
    }

    public Personaje obtenerPersonajePorNombre(String nombre) {
        return personajeRepository.findByNombre(nombre);
    }

    public List<Personaje> getPersonajes() {
        return personajeRepository.getPersonajes();
    }

}
