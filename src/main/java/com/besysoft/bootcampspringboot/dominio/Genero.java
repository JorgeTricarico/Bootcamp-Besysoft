package com.besysoft.bootcampspringboot.dominio;

import java.util.List;

public class Genero {

    String nombre;
    List<String> peliculaSerie;

    public Genero() {
    }

    public Genero(String nombre, List<String> peliculaSerie) {
        this.nombre = nombre;
        this.peliculaSerie = peliculaSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPeliculaSerie() {
        return peliculaSerie;
    }

    public void setPeliculaSerie(List<String> peliculaSerie) {
        this.peliculaSerie = peliculaSerie;
    }
}
