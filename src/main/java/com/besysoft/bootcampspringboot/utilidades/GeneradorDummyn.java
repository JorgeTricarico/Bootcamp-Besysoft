package com.besysoft.bootcampspringboot.utilidades;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaSerie;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDummyn {
        public List<Genero> crearDatosGenero (){

        List<Genero> listaDeGeneros = new ArrayList<>();

        List<String> listaPeliculasSerieDrama = new ArrayList<>();
        List<String> listaPeliculasSerieAventura = new ArrayList<>();
        List<String> listaPeliculasSerieAccion = new ArrayList<>();
        List<String> listaPeliculasSerieTerror = new ArrayList<>();

        listaPeliculasSerieDrama.add("El Temblor");
        listaPeliculasSerieDrama.add("El Temblor 2");
        listaPeliculasSerieDrama.add("La Esclava");

        listaPeliculasSerieAventura.add("Harry Potter 1");
        listaPeliculasSerieAventura.add("Harry Potter 2");
        listaPeliculasSerieAventura.add("Harry Potter 3");
        listaPeliculasSerieAventura.add("Harry Potter 4");
        listaPeliculasSerieAventura.add("Harry Potter 5");

        listaPeliculasSerieAccion.add("Rapido y Furioso 1");
        listaPeliculasSerieAccion.add("Rapido y Furioso 2");
        listaPeliculasSerieAccion.add("Rapido y Furioso 3");
        listaPeliculasSerieAccion.add("Rapido y Furioso 4");
        listaPeliculasSerieAccion.add("Rapido y Furioso 30");

        listaPeliculasSerieTerror.add("La Huerfana 1");
        listaPeliculasSerieTerror.add("La Huerfana 2");
        listaPeliculasSerieTerror.add("La Huerfana 3");
        listaPeliculasSerieTerror.add("La Huerfana 4");
        listaPeliculasSerieTerror.add("Juego del Miedo 1");
        listaPeliculasSerieTerror.add("Juego del Miedo 2");
        listaPeliculasSerieTerror.add("Juego del Miedo 3");
        listaPeliculasSerieTerror.add("Juego del Miedo 4");

        Genero drama = new Genero("Drama", listaPeliculasSerieDrama);
        Genero aventura = new Genero("Aventura", listaPeliculasSerieAventura);
        Genero accion = new Genero("Accion", listaPeliculasSerieAccion);
        Genero terror = new Genero("Terror", listaPeliculasSerieTerror);

        listaDeGeneros.add(drama);
        listaDeGeneros.add(aventura);
        listaDeGeneros.add(accion);
        listaDeGeneros.add(terror);

        return listaDeGeneros;
    }


}
