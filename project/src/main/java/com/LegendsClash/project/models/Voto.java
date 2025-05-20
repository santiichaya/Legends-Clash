package com.LegendsClash.project.models;

import jakarta.persistence.*;


@Entity
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_batalla", nullable = false)
    private Batalla batalla;

    @ManyToOne
    @JoinColumn(name = "id_equipo_votado", nullable = false)
    private Equipo equipoVotado;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Batalla getBatalla() {
        return batalla;
    }

    public void setBatalla(Batalla batalla) {
        this.batalla = batalla;
    }

    public Equipo getEquipoVotado() {
        return equipoVotado;
    }

    public void setEquipoVotado(Equipo equipoVotado) {
        this.equipoVotado = equipoVotado;
    }
}
