package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Puedes añadir más consultas personalizadas si las necesitas
    Usuario findByEmail(String email);  // Para buscar usuario por su email
}
