package com.LegendsClash.project.controllers;

import com.LegendsClash.project.DTO.VotoDTO;
import com.LegendsClash.project.models.Usuario;
import com.LegendsClash.project.models.Voto;
import com.LegendsClash.project.repositories.UsuarioRepository;
import com.LegendsClash.project.services.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/votos")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Voto votar(@RequestBody VotoDTO voto) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Usuario usuario = usuarioRepository.findByUsername(username).orElse(null);
        return votoService.guardarVoto(voto, usuario.getId());
    }

    @GetMapping("/{id}")
    public Voto[] obtenerVotos(@PathVariable Long id) {
        return votoService.obtenerVotoPorIdBatalla(id);
    }

    @GetMapping("/votoUsuario/{id}")
    public Voto[] obtenerVoto(@PathVariable Long id) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Usuario usuario = usuarioRepository.findByUsername(username).orElse(null);
        return votoService.obtenerVotoBatallaUsuario(id, usuario.getId());
    }
}