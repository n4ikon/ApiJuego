package com.example.demo.controller;

import com.example.demo.model.Jugador;
import com.example.demo.model.Response;
import com.example.demo.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jugador")
public class JugadorController {

    @Autowired
    public JugadorService jugadorService;

    @PostMapping
    public ResponseEntity<Response> registrar(@RequestBody Jugador jugador) throws Exception {
        Response response = new Response();
        try {
            // Llamamos al servicio
            jugadorService.agregar(jugador);
            response.setStatusCode("200");
            response.setStatusMsg("jugador creada");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            response.setStatusCode("400");
            response.setStatusMsg(e.getLocalizedMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
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


