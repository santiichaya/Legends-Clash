package com.LegendsClash.project.repositories;

import com.LegendsClash.project.DTO.LoginDTO;
import com.LegendsClash.project.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Puedes añadir más consultas personalizadas si las necesitas
    Usuario findByEmail(String email);  // Para buscar usuario por su email

    @Query("""
            SELECT u FROM Usuario u
            WHERE u.nombre = :nombre
            AND u.contrasena = :contrasena""")
    Usuario validarUsuario(
            @Param("nombre") String nombre,
            @Param("contrasena") String contrasena
    );
}
