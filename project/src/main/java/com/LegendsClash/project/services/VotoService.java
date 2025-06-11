package com.LegendsClash.project.services;

import com.LegendsClash.project.DTO.VotoDTO;
import com.LegendsClash.project.models.Batalla;
import com.LegendsClash.project.models.Equipo;
import com.LegendsClash.project.models.Usuario;
import com.LegendsClash.project.models.Voto;
import com.LegendsClash.project.repositories.BatallaRepository;
import com.LegendsClash.project.repositories.EquipoRepository;
import com.LegendsClash.project.repositories.UsuarioRepository;
import com.LegendsClash.project.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private BatallaRepository batallaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Voto guardarVoto(VotoDTO voto, Long usuario_id) {
        Voto dato = new Voto();
        Batalla batalla = batallaRepository.findById(voto.getId_batalla()).orElse(null);
        dato.setBatalla(batalla);
        Equipo equipo = equipoRepository.findById(voto.getId_equipo()).orElse(null);
        dato.setEquipoVotado(equipo);
        Usuario usuario = usuarioRepository.findById(usuario_id).orElse(null);
        dato.setUsuario(usuario);
        return votoRepository.save(dato);
    }

    public Voto[] obtenerVotoPorIdBatalla(Long id) {
        return votoRepository.obtenerPorIdBatalla(id);
    }

    public Voto[] obtenerVotoBatallaUsuario(Long batalla_id, Long user_id) {
        return votoRepository.obtenerPorBatallaYUsuario(batalla_id, user_id);
    }
}
