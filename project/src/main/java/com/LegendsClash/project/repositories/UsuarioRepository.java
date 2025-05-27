package com.LegendsClash.project.repositories;

import com.LegendsClash.project.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Puedes añadir más consultas personalizadas si las necesitas
    Usuario findByEmail(String email);  // Para buscar usuario por su email

    Usuario findByUsername(String username);

    //@Query("""
    //            SELECT u FROM Usuario u
    //            WHERE u.nombre = :#{#usuario.nombre}
    //            AND u.contrasena = :#{#usuario.contrasena}""")
    //    Usuario validarUsuario(@Param("usuario") LoginDTO usuario);
}
