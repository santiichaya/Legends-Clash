package com.LegendsClash.project.controllers;

import com.LegendsClash.project.models.Batalla;
import com.LegendsClash.project.services.BatallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/batallas")
public class BatallaController {

    @Autowired
    private BatallaService batallaService;

    @PostMapping
    public Batalla crearBatalla(@RequestBody Batalla batalla) {
        return batallaService.guardarBatalla(batalla);
    }

    @GetMapping("/{id}")
    public Batalla obtenerBatalla(@PathVariable Long id) {
        return batallaService.obtenerBatallaPorId(id);
    }
}
