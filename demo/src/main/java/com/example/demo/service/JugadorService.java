package com.example.demo.service;

import com.example.demo.dto.GuardadoUsuario;
import com.example.demo.model.Jugador;
import com.example.demo.repository.JugadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JugadorService {
    @Autowired
   public  JugadorRepository jugadorRepository;

    public Jugador agregar(Jugador jugador) throws Exception{
        try {
            return jugadorRepository.save(jugador);

        } catch (Exception err) {
            throw new Exception("Error, posible duplicado");
        }
    }
    public List<Jugador> listar(){
        return jugadorRepository.findAll();
    }

    public Jugador buscarJugadorPorNombre(String nombre) {
        return jugadorRepository.findJugadorByNombre(nombre);
    }



   public  Jugador cargar(GuardadoUsuario jugador) throws Exception {
        try {
            System.out.println(jugador.toString());
            Jugador jugadorbase = jugadorRepository.findJugadorByNombre(jugador.nombre);
            System.out.println(jugadorbase.toString());
            jugadorbase.setPosicionX(jugador.posicionX);
            jugadorbase.setPosicionY(jugador.PosicionY);
            return jugadorRepository.save(jugadorbase);



        } catch (Exception err) {
               throw new Exception(err);
        }

    }
}
