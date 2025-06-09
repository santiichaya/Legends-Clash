package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VotoRepository extends JpaRepository<Voto, Long> {

    @Query("""
            SELECT v FROM Voto v
            WHERE v.batalla.id = :id
            """)
    Voto[] obtenerPorIdBatalla(@Param("id") Long id);
}