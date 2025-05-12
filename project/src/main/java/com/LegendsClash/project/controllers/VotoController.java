package com.LegendsClash.project.controllers;

import com.LegendsClash.project.models.Voto;
import com.LegendsClash.project.services.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votos")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @PostMapping
    public Voto votar(@RequestBody Voto voto) {
        return votoService.guardarVoto(voto);
    }

    @GetMapping("/{id}")
    public Voto obtenerVoto(@PathVariable Long id) {
        return votoService.obtenerVotoPorId(id);
    }
}