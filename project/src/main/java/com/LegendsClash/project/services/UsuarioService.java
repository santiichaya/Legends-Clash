package com.LegendsClash.project.services;

import com.LegendsClash.project.DTO.UserRegister;
import com.LegendsClash.project.models.UserAuthority;
import com.LegendsClash.project.models.Usuario;
import com.LegendsClash.project.repositories.UsuarioRepository;
import com.LegendsClash.project.seguridad.PasswordEncoderConfig;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository repository, PasswordEncoder passwordEncoder) {
        this.repo = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<Usuario> findByUsername(String username) {
        return this.repo.findByUsername(username);
    }

    public Usuario save(UserRegister userDTO) {
        Usuario user = new Usuario(
                null,
                userDTO.username(),
                passwordEncoder.encode(userDTO.password()),
                userDTO.email(),
                List.of(UserAuthority.ROLE_USER)
        );

        Usuario user1 = new Usuario(
                null,
                userDTO.username(),
                passwordEncoder.encode(userDTO.password()),
                userDTO.email(),
                List.of(UserAuthority.ROLE_USER)
        );
        return this.repo.save(user);
    }
}

