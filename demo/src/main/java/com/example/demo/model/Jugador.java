package com.example.demo.model;


public class Jugador {


    private String nombre;

    private Integer Id;

    private String password;


    public Jugador() {
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   @Override
    public String toString() {
        return "Jugador{" +
                "id=" + Id +
                ", nombre='" + nombre + " , password="  + password + '}';
}
}
