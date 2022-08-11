package com.example.demo.repository;

import com.example.demo.model.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends MongoRepository<Jugador,Integer> {

    Jugador findJugadorByNombre(String nombre);
}
