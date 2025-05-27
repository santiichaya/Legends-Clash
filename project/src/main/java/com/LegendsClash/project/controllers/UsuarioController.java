package com.LegendsClash.project.controllers;

import com.LegendsClash.project.DTO.UserRegister;
import com.LegendsClash.project.models.Usuario;
import com.LegendsClash.project.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/guardarUsuario")
    public Usuario registrarUsuario(@RequestBody UserRegister usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/email/{email}")
    public Usuario obtenerUsuarioPorEmail(@PathVariable String email) {
        return usuarioService.obtenerUsuarioPorEmail(email);
    }

    //@PostMapping("/validarUsuario")
    //    public Usuario validarUsuario(@RequestBody LoginDTO usuario) {
    //        return usuarioService.validarUsuario(usuario);
    //    }
}