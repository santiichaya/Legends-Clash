package com.LegendsClash.project.DTO;

public class LoginDTO {
    private String nombre;
    private String contrasena;

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
