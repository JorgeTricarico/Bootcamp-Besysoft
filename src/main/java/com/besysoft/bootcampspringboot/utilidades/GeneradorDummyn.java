package com.besysoft.bootcampspringboot.utilidades;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaSerie;
import com.besysoft.bootcampspringboot.dominio.Personaje;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDummyn {

        public static final List<Genero> listaDeGeneros = crearDatosGenero();

        private static List<Genero> crearDatosGenero (){


        List<Genero> listaDeGeneros = new ArrayList<>();

        List<String> listaPeliculaSerieDrama = new ArrayList<>();
        List<String> listaPeliculaSerieAventura = new ArrayList<>();
        List<String> listaPeliculaSerieAccion = new ArrayList<>();
        List<String> listaPeliculaSerieTerror = new ArrayList<>();

        listaPeliculaSerieDrama.add("El Temblor");
        listaPeliculaSerieDrama.add("El Temblor 2");
        listaPeliculaSerieDrama.add("La Esclava");

        listaPeliculaSerieAventura.add("Harry Potter 1");
        listaPeliculaSerieAventura.add("Harry Potter 2");
        listaPeliculaSerieAventura.add("Harry Potter 3");
        listaPeliculaSerieAventura.add("Harry Potter 4");
        listaPeliculaSerieAventura.add("Harry Potter 5");

        listaPeliculaSerieAccion.add("Rapido y Furioso 1");
        listaPeliculaSerieAccion.add("Rapido y Furioso 2");
        listaPeliculaSerieAccion.add("Rapido y Furioso 3");
        listaPeliculaSerieAccion.add("Rapido y Furioso 4");
        listaPeliculaSerieAccion.add("Rapido y Furioso 30");

        listaPeliculaSerieTerror.add("La Huerfana 1");
        listaPeliculaSerieTerror.add("La Huerfana 2");
        listaPeliculaSerieTerror.add("La Huerfana 3");
        listaPeliculaSerieTerror.add("La Huerfana 4");
        listaPeliculaSerieTerror.add("Juego del Miedo 1");
        listaPeliculaSerieTerror.add("Juego del Miedo 2");
        listaPeliculaSerieTerror.add("Juego del Miedo 3");
        listaPeliculaSerieTerror.add("Juego del Miedo 4");

        Genero drama = new Genero("Drama", listaPeliculaSerieDrama);
        Genero aventura = new Genero("Aventura", listaPeliculaSerieAventura);
        Genero accion = new Genero("Accion", listaPeliculaSerieAccion);
        Genero terror = new Genero("Terror", listaPeliculaSerieTerror);

        listaDeGeneros.add(drama);
        listaDeGeneros.add(aventura);
        listaDeGeneros.add(accion);
        listaDeGeneros.add(terror);

        return listaDeGeneros;
    }

        private static List<Personaje> crearPersonajes(){

                List<Personaje> listaPersonajes = new ArrayList<>();




                return listaPersonajes;
        }


}
