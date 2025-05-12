package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    // Puedes añadir métodos personalizados como buscar equipos por usuario
    Equipo findByNombreEquipo(String nombreEquipo);
}
