package com.example.demo.controller;


import com.example.demo.dto.LoginCredentialsDto;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Autenticacion {
    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginCredentialsDto credenciales) {
        return authService.login(credenciales.nombre, credenciales.password);
    }
}
