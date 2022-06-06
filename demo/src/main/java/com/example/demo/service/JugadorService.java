package com.example.demo.service;

import com.example.demo.model.Jugador;
import com.example.demo.repository.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JugadorService {
   public JugadorRepository jugadorRepository;

    public JugadorService(JugadorRepository jugadorRepository){this.jugadorRepository = jugadorRepository;}
    public Jugador agregar(Jugador jugador){
        return jugadorRepository.save(jugador);
    }
    public List<Jugador> listar(){
        return jugadorRepository.findAll();
    }





}
