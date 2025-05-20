package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    // Puedes añadir consultas personalizadas si las necesitas
    Personaje findByNombre(String nombre);

    @Query("""
            SELECT p
            FROM Personaje p
            ORDER BY p.id
            """)
    List<Personaje> getPersonajes();
}
