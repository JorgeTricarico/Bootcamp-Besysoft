package com.besysoft.bootcampspringboot.dominio;

import com.besysoft.bootcampspringboot.utilidades.GeneradorDummyn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PeliculaSerie {
    private List<Personaje> listaPersonajes = GeneradorDummyn.listaDePersonajes;

    private String titulo;
    private LocalDate fechaDeCreacion;
    private Integer calificacion;
    private List<String> personajesAsociados;

    public PeliculaSerie() {
    }

    public PeliculaSerie(String titulo, String fechaDeCreacion, Integer calificacion) {
        this.titulo = titulo;
        this.fechaDeCreacion = LocalDate.parse(fechaDeCreacion);
        this.calificacion = calificacion;

        List<String> personajes =  new ArrayList<>();

        listaPersonajes.forEach(personaje -> {
            personaje.getPeliculaSerieAsociada().forEach(pelicula -> {
                if (pelicula.matches(this.titulo)){
                    personajes.add(personaje.getNombre());
                }
            });
        });

        this.personajesAsociados = personajes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public List<String> getPersonajesAsociados() {
        return personajesAsociados;
    }

    public void setPersonajesAsociados(List<String> personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }



    @Override
    public String toString() {
        return "PeliculaSerie{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", calificacion=" + calificacion +
                ", personajesAsociados=" + personajesAsociados +
                '}';
    }
}
