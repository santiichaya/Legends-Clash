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

    @Query("""
            SELECT v FROM Voto v
            WHERE v.batalla.id = :batalla_id AND v.usuario.id = :usuario_id
            """)
    Voto[] obtenerPorBatallaYUsuario(@Param("batalla_id") Long batalla_id, @Param("usuario_id") Long usuario_id);
}