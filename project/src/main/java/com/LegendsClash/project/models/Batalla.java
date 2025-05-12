package com.LegendsClash.project.models;

import jakarta.persistence.*;

@Entity
public class Batalla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBatalla;

    @ManyToOne
    @JoinColumn(name = "id_equipo_1", nullable = false)
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name = "id_equipo_2", nullable = false)
    private Equipo equipo2;

    // Getters y Setters
    public Long getIdBatalla() {
        return idBatalla;
    }

    public void setIdBatalla(Long idBatalla) {
        this.idBatalla = idBatalla;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
}
