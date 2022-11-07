package com.example.demo.repository;

import com.example.demo.model.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JugadorRepository extends MongoRepository<Jugador,Integer> {

    Optional<Jugador> findJugadorByNombre(String nombre);
}
