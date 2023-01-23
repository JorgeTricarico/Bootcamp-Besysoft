package com.besysoft.bootcampspringboot.dominio;

import java.util.List;

public class Personaje {

    private String nombre;
    private Integer edad;
    private Float peso;
    private String historia;

    private List<String> peliculaSerieAsociada;

    public Personaje() {
    }

    public Personaje(String nombre, Integer edad, Float peso, String historia, List<String> peliculaSerieAsociada) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculaSerieAsociada = peliculaSerieAsociada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public List<String> getPeliculaSerieAsociada() {
        return peliculaSerieAsociada;
    }

    public void setPeliculaSerieAsociada(List<String> peliculaSerieAsociada) {
        this.peliculaSerieAsociada = peliculaSerieAsociada;
    }
}


