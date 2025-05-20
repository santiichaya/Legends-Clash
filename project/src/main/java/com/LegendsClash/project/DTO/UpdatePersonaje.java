package com.LegendsClash.project.DTO;

import jakarta.persistence.Id;

public class UpdatePersonaje {
    @Id
    private int id;
    private String nombre;
    private String saga;
    private String descripcion;
    private int fuerza;
    private int inteligencia;
    private int resistencia;
    private int velocidad;
    private int agilidad;
    private int carisma;
    private int alcance;
    private int altura;
    private int peso;
    private int experiencia;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getAlcance() {
        return alcance;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSaga() {
        return saga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
