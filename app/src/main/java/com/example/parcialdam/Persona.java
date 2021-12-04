package com.example.parcialdam;

import java.util.function.Consumer;

public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;

    public Persona() {
            }

    public  Persona(Consumer<Persona> p){
        p.accept(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
