package com.example.demo.service;

import com.example.demo.model.Jugador;
import com.example.demo.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    JugadorRepository jugadorRepository;

    public boolean login(String nombre, String password) {
        try {
            Optional<Jugador> jugador = Optional.ofNullable(jugadorRepository.findJugadorByNombre(nombre));
            if (!jugador.isPresent()) {
                return false;
            }
            if(!Objects.equals(jugador.get().getNombre(), nombre)) {
                return false;
            }
            if(!Objects.equals(jugador.get().getPassword(), password)) {
                return false;
            }
            return true;
        } catch (Exception err) {
            throw err;
        }
    }
}
