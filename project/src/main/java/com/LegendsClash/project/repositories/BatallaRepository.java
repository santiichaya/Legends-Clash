package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Batalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BatallaRepository extends JpaRepository<Batalla, Long> {


    @Query("""
            SELECT b FROM Batalla b
            ORDER BY b.id DESC
            """)
    List<Batalla> getBatallas();

    @Query("""
            SELECT b FROM Batalla b
            WHERE b.id = :id
            """)
    Batalla getBatallaById(Long id);
}
