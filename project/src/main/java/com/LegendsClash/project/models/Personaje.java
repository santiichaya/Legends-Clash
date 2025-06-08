package com.LegendsClash.project.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String saga;
    private String imagenCuerpo;
    private String imagenBatalla;
    private String imagenBusto;
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

    @ManyToMany(mappedBy = "personajes")
    private List<Equipo> equipos = new ArrayList<>();

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public String getImagenCuerpo() {
        return imagenCuerpo;
    }

    public void setImagenCuerpo(String imagenCuerpo) {
        this.imagenCuerpo = imagenCuerpo;
    }

    public String getImagenBatalla() {
        return imagenBatalla;
    }

    public void setImagenBatalla(String imagenBatalla) {
        this.imagenBatalla = imagenBatalla;
    }

    public String getImagenBusto() {
        return imagenBusto;
    }

    public void setImagenBusto(String imagenBusto) {
        this.imagenBusto = imagenBusto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
