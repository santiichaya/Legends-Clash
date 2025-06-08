package com.LegendsClash.project.DTO;

import java.util.List;

public class CrearBatallaDTO {
    public String nombre;
    private String nombreEquipo1;
    private String nombreEquipo2;
    private List<Long> personajes1;
    private List<Long> personajes2;


    public void setPersonajes1(List<Long> personajes1) {
        this.personajes1 = personajes1;
    }

    public void setPersonajes2(List<Long> personajes2) {
        this.personajes2 = personajes2;
    }

    public List<Long> getPersonajes1() {
        return personajes1;
    }

    public List<Long> getPersonajes2() {
        return personajes2;
    }

    public void setNombreEquipo2(String nombreEquipo2) {
        this.nombreEquipo2 = nombreEquipo2;
    }

    public void setNombreEquipo1(String nombreEquipo1) {
        this.nombreEquipo1 = nombreEquipo1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreEquipo1() {
        return nombreEquipo1;
    }

    public String getNombreEquipo2() {
        return nombreEquipo2;
    }
}
