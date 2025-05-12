package com.LegendsClash.project.services;

import com.LegendsClash.project.models.Equipo;
import com.LegendsClash.project.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public Equipo obtenerEquipoPorId(Long id) {
        return equipoRepository.findById(id).orElse(null);
    }

    public Equipo obtenerEquipoPorNombre(String nombreEquipo) {
        return equipoRepository.findByNombreEquipo(nombreEquipo);
    }

    // Otros métodos si es necesario
}
