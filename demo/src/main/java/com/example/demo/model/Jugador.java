package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "users")
public class Jugador {

    @Id
    @Field("_id")
    @JsonIgnore
    private String id;

    @NotNull
    @Indexed(unique = true)
    private String nombre;


    private String password;

}
