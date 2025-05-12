package com.LegendsClash.project.controllers;

import com.LegendsClash.project.models.Equipo;
import com.LegendsClash.project.services.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping
    public Equipo registrarEquipo(@RequestBody Equipo equipo) {
        return equipoService.guardarEquipo(equipo);
    }

    @GetMapping("/{id}")
    public Equipo obtenerEquipo(@PathVariable Long id) {
        return equipoService.obtenerEquipoPorId(id);
    }

    @GetMapping("/nombre/{nombreEquipo}")
    public Equipo obtenerEquipoPorNombre(@PathVariable String nombreEquipo) {
        return equipoService.obtenerEquipoPorNombre(nombreEquipo);
    }
}
