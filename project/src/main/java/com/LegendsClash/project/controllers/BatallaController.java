package com.LegendsClash.project.controllers;

import com.LegendsClash.project.DTO.CrearBatallaDTO;
import com.LegendsClash.project.models.Batalla;
import com.LegendsClash.project.services.BatallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/batallas")
public class BatallaController {

    @Autowired
    private BatallaService batallaService;

    @GetMapping("/{id}")
    public Batalla obtenerBatalla(@PathVariable Long id) {
        return batallaService.obtenerBatallaPorId(id);
    }

    @GetMapping("/getBatallas")
    public List<Batalla> getBatallas() {
        return batallaService.getBatallas();
    }

    @PostMapping
    public Batalla crearBatalla(@RequestBody CrearBatallaDTO batalla) {
        System.out.println(batalla);
        return batallaService.guardarBatalla(batalla);
    }

}
