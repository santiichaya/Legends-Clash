package com.LegendsClash.project.services;

import com.LegendsClash.project.models.Voto;
import com.LegendsClash.project.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    public Voto guardarVoto(Voto voto) {
        return votoRepository.save(voto);
    }

    public Voto obtenerVotoPorId(Long id) {
        return votoRepository.findById(id).orElse(null);
    }

    // Otros métodos para gestionar votos
}
