package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Version;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.web.bind.annotation.PutMapping;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "jugadortres")
public class Jugador {

    public static String getnombre;
    @Id

    private String id;



    @NotNull

    private String nombre;


    private String password;

    private double posicionX ;
    private double posicionY ;


}
