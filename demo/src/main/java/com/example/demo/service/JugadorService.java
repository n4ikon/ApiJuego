package com.example.demo.service;

import com.example.demo.dto.GuardadoUsuario;
import com.example.demo.dto.LoginCredentialsDto;
import com.example.demo.model.Jugador;
import com.example.demo.repository.JugadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorService {
    @Autowired
   public  JugadorRepository jugadorRepository;

    public Jugador agregar(Jugador jugador) throws Exception{
        try {

            if (buscarJugadorPorNombre(jugador.getNombre()).isPresent()){
                throw new Exception("Ya existe jugador");
            }else return jugadorRepository.save(jugador);

        } catch (Exception err) {
            throw new Exception("Error, posible duplicado");
        }
    }
    public List<Jugador> listar(){
        return jugadorRepository.findAll();
    }

    public Optional<Jugador>  buscarJugadorPorNombre(String nombre) {
        return jugadorRepository.findJugadorByNombre(nombre);
    }



   public  Jugador cargar(GuardadoUsuario jugador) throws Exception {
        try {
            System.out.println(jugador.toString());
            Optional<Jugador> jugadorbase = jugadorRepository.findJugadorByNombre(jugador.nombre);
            System.out.println(jugadorbase.toString());
            jugadorbase.get().setPosicionX(jugador.posicionX);
            jugadorbase.get().setPosicionY(jugador.PosicionY);
            return jugadorRepository.save(jugadorbase.get());



        } catch (Exception err) {
               throw new Exception(err);
        }

    }
}
