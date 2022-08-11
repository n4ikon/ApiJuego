package com.example.demo.controller;

import com.example.demo.model.Jugador;
import com.example.demo.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jugador")
public class JugadorController {

    @Autowired
    public JugadorService jugadorService;

    @PostMapping
    public Jugador registrar(@RequestBody Jugador jugador) {
        return jugadorService.agregar(jugador);
    }


    @GetMapping
    public List<Jugador> listar() {
        return jugadorService.listar();
    }

    @GetMapping("/{nombre}")
    public Jugador encontrarJugadorPorNombre(@RequestParam String nombre) {
        return jugadorService.buscarJugadorPorNombre(nombre);

    }

}


