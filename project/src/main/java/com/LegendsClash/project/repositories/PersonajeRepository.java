package com.LegendsClash.project.repositories;

import com.LegendsClash.project.DTO.UpdatePersonaje;
import com.LegendsClash.project.models.Personaje;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    @Modifying
    @Transactional
    @Query("""
            UPDATE Personaje p
                SET
                p.nombre = :#{#personaje.nombre},
                p.saga = :#{#personaje.saga},
                p.descripcion = :#{#personaje.descripcion},
                p.fuerza = :#{#personaje.fuerza},
                p.inteligencia = :#{#personaje.inteligencia},
                p.resistencia = :#{#personaje.resistencia},
                p.velocidad = :#{#personaje.velocidad},
                p.agilidad = :#{#personaje.agilidad},
                p.carisma = :#{#personaje.carisma},
                p.alcance = :#{#personaje.alcance},
                p.altura = :#{#personaje.altura},
                p.peso = :#{#personaje.peso},
                p.experiencia = :#{#personaje.experiencia}
                WHERE p.id = :#{#personaje.id}
            """)
    void updatePersonaje(@Param("personaje") UpdatePersonaje personaje);
}
