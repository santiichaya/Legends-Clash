package com.LegendsClash.project.controllers;

import com.LegendsClash.project.DTO.LoginRequest;
import com.LegendsClash.project.DTO.LoginResponse;
import com.LegendsClash.project.DTO.UserRegister;
import com.LegendsClash.project.models.Usuario;
import com.LegendsClash.project.seguridad.JwtTokenProvider;
import com.LegendsClash.project.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private UsuarioService userService;
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;



    @PostMapping("/auth/register")
    public ResponseEntity<?> save(@RequestBody UserRegister userDTO) {
        try {
            Usuario usuario = this.userService.save(userDTO);
            return ResponseEntity.ok(usuario);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario o email ya existe");
        }
    }

    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody LoginRequest loginDTO){
        Authentication authDTO = new UsernamePasswordAuthenticationToken(loginDTO.username(), loginDTO.password());
        Authentication authentication = this.authManager.authenticate(authDTO);
        Usuario user = (Usuario) authentication.getPrincipal();

        String token = this.jwtTokenProvider.generateToken(authentication);

        return new LoginResponse(user.getUsername(),
                user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList(),
                token);
    }
}

