package com.LegendsClash.project.services;

import com.LegendsClash.project.DTO.CrearBatallaDTO;
import com.LegendsClash.project.models.Batalla;
import com.LegendsClash.project.models.Equipo;
import com.LegendsClash.project.models.Personaje;
import com.LegendsClash.project.repositories.BatallaRepository;
import com.LegendsClash.project.repositories.EquipoRepository;
import com.LegendsClash.project.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatallaService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private BatallaRepository batallaRepository;

    public Batalla guardarBatalla(CrearBatallaDTO batalla) {
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo(batalla.getNombreEquipo1());

        // Obtener y asignar personajes al equipo
        List<Personaje> personajesEquipo1 = personajeRepository.findAllById(batalla.getPersonajes1());
        equipo1.setPersonajes(personajesEquipo1);
        equipo1 = equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo(batalla.getNombreEquipo2());

        // Obtener y asignar personajes al equipo
        List<Personaje> personajesEquipo2 = personajeRepository.findAllById(batalla.getPersonajes2());
        equipo2.setPersonajes(personajesEquipo2);
        equipo2 = equipoRepository.save(equipo2);

        Batalla nuevaBatalla = new Batalla();
        nuevaBatalla.setEquipo1(equipo1);
        nuevaBatalla.setEquipo2(equipo2);
        nuevaBatalla.setNombre(batalla.getNombre());

        return batallaRepository.save(nuevaBatalla);
    }

    public Batalla obtenerBatallaPorId(Long id) {
        return batallaRepository.findById(id).orElse(null);
    }

    public List<Batalla> getBatallas() {
        return batallaRepository.getBatallas();
    }
}
