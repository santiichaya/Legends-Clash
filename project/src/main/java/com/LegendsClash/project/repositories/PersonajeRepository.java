package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    // Puedes añadir consultas personalizadas si las necesitas
    Personaje findByNombre(String nombre);
}
