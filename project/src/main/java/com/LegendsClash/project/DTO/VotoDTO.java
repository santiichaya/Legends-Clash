package com.LegendsClash.project.DTO;

public class VotoDTO {
    private Long id_batalla;
    private Long id_equipo;

    public void setId_batalla(Long id_batalla) {
        this.id_batalla = id_batalla;
    }

    public void setId_equipo(Long id_equipo) {
        this.id_equipo = id_equipo;
    }

    public Long getId_batalla() {
        return id_batalla;
    }

    public Long getId_equipo() {
        return id_equipo;
    }
}
