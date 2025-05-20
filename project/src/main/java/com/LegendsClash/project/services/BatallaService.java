package com.LegendsClash.project.services;

import com.LegendsClash.project.models.Batalla;
import com.LegendsClash.project.repositories.BatallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatallaService {

    @Autowired
    private BatallaRepository batallaRepository;

    public Batalla guardarBatalla(Batalla batalla) {
        return batallaRepository.save(batalla);
    }

    public Batalla obtenerBatallaPorId(Long id) {
        return batallaRepository.findById(id).orElse(null);
    }

    public List<Batalla> getBatallas() {
        return batallaRepository.getBatallas();
    }

    // Otros métodos para gestionar batallas
}
