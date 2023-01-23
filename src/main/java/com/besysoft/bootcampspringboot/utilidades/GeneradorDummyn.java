package com.besysoft.bootcampspringboot.utilidades;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaSerie;
import com.besysoft.bootcampspringboot.dominio.Personaje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneradorDummyn {

        public static final List<Genero> listaDeGeneros = crearDatosGenero();
        public static final List<Personaje> listaDePersonajes = crearPersonajes();

        public static final List<PeliculaSerie> listaDePeliculas = crearPeliculaSerie();

        private static List<Genero> crearDatosGenero (){

        List<String> listaPeliculaSerieDrama = new ArrayList<>(
                Arrays.asList(
                        "El Temblor 1",
                        "El Temblor 2",
                        "La Esclava"
                )
        );
        List<String> listaPeliculaSerieAventura = new ArrayList<>(
                Arrays.asList(
                        "Harry Potter 1",
                        "Harry Potter 2",
                        "Harry Potter 3",
                        "Harry Potter 4",
                        "Harry Potter 5"
                )
        );
        List<String> listaPeliculaSerieAccion = new ArrayList<>(
                Arrays.asList(
                        "Rapido y Furioso 1",
                        "Rapido y Furioso 2",
                        "Rapido y Furioso 3",
                        "Rapido y Furioso 4",
                        "Rapido y Furioso 30"
                )
        );
        List<String> listaPeliculaSerieTerror = new ArrayList<>(
                Arrays.asList(
                        "La Huerfana 1",
                        "La Huerfana 2",
                        "La Huerfana 3",
                        "La Huerfana 4",
                        "Juego del Miedo 1",
                        "Juego del Miedo 2",
                        "Juego del Miedo 3",
                        "Juego del Miedo 4"
                )
        );


        List<Genero> listaDeGeneros = new ArrayList<>(
                Arrays.asList(
                        new Genero("Drama", listaPeliculaSerieDrama),
                        new Genero("Aventura", listaPeliculaSerieAventura),
                        new Genero("Accion", listaPeliculaSerieAccion),
                        new Genero("Terror", listaPeliculaSerieTerror)
                        )
        );

        return listaDeGeneros;
    }

        private static List<Personaje> crearPersonajes(){

                List<Personaje> listaPersonajes = new ArrayList<>(Arrays.asList(

                        // Personajes de El Temblor 1 y 2.
                        new Personaje("Jesica", 28, 70F,
                                "Jesica es una chica que vive sola en la casa del pueblo que sus padres le dejaron.",
                                new ArrayList<>(Arrays.asList("El Temblor 1","El Temblor 2"))),
                        new Personaje("Oracio", 26, 82F,
                                "Oracio es un chico timido que es el cartero del pueblo.",
                                new ArrayList<>(Arrays.asList("El Temblor 1","El Temblor 2"))),

                        // Personajes de Rapido y Furioso 1, 2, 3, 4 y 30.
                        new Personaje("La Roca", 45, 102F,
                                 "Un tipo rudo que no obedece las reglas, su vida fue siempre muy dura y no le teme al peligro",
                                new ArrayList<>(Arrays.asList("Rapido y Furioso 1","Rapido y Furioso 2","Rapido y Furioso 3","Rapido y Furioso 4","Rapido y Furioso 30"))),
                        new Personaje("Hernesto Palacio", 40, 78F,
                                "Un hombre comun que viene ed una familia de clase media. Nadacido en Mexico y siempre se mete en problemas",
                                new ArrayList<>(Arrays.asList("Rapido y Furioso 1","Rapido y Furioso 2","Rapido y Furioso 3","Rapido y Furioso 4","Rapido y Furioso 30"))),
                        new Personaje("Keyti", 35, 68F,
                                "Una chica rebelde que no obedece las reglas, nacida en Miami de familia, es mecanica de niña",
                                new ArrayList<>(Arrays.asList("Rapido y Furioso 1","Rapido y Furioso 2","Rapido y Furioso 3","Rapido y Furioso 4","Rapido y Furioso 30"))),

                        // Personajes de Harry Potter 1, 2, 3, 4 y 5.
                        new Personaje("Harry Potter", 10, 43F,
                                "Harry es un niño hurfano que fue creado por sus tios que lo desprecian por sus habilidades magicas",
                                new ArrayList<>(Arrays.asList("Harry Potter 1","Harry Potter 2","Harry Potter 3","Harry Potter 4","Harry Potter 5"))),

                        new Personaje("Ron Haswich", 10, 45F,
                                "Ron es un niño torpe y despistado, hijo de padres magos que lo aman",
                                new ArrayList<>(Arrays.asList("Harry Potter 1","Harry Potter 2","Harry Potter 3","Harry Potter 4","Harry Potter 5"))),

                        new Personaje("Hermione Jean Granger", 10, 39F,
                                "Hermione es una niña hija de muggles dentistas, sin embargo ella es maga y asiste ala escuela de magia",
                                new ArrayList<>(Arrays.asList("Harry Potter 1","Harry Potter 2","Harry Potter 3","Harry Potter 4","Harry Potter 5"))),

                        // Personajes La Esclava

                        new Personaje("Lisandra", 16, 46F, "Lisandra es una esclava carismatica y hermosa, hija de padres esclavos rebeldes", new ArrayList<>(Arrays.asList("La esclava"))),
                        new Personaje("Lisandro", 18, 58F, "Lisandro es una esclavo rudo y hermosa, hijo de padres esclavos rebeldes", new ArrayList<>(Arrays.asList("La esclava"))),
                        new Personaje("Hernesto Hernandez", 50, 86F, "Hernesto es un esclavista viudo  y cruel con sus esclavos", new ArrayList<>(Arrays.asList("La esclava"))),
                        new Personaje("Isaias Norting", 48, 83F, "Isaias es un esclavista hermoso y bueno con sus esclavos", new ArrayList<>(Arrays.asList("La esclava"))),

                        // Personajes La Huerfana 1, 2 ,3 y 4

                        new Personaje("Lisa", 13, 38F, "Lisa es un huerfana retraida y timida poseida por un ser maligno", new ArrayList<>(Arrays.asList("La huerfana 1","La huerfana 2","La huerfana 3","La huerfana 4"))),

                        // Personajes El juego del miedo 1, 2 , 3 y 4

                        new Personaje("Julio", 39, 89F, "Julio es un hombre solitario que le gusta ver sufrir a las personas", new ArrayList<>(Arrays.asList("El Juego del Miedo 1","El Juego del Miedo 2","El Juego del Miedo 3","El Juego del Miedo 4")))

                ));

                return listaPersonajes;
        }

        private static List<PeliculaSerie> crearPeliculaSerie(){
                List<PeliculaSerie> listaDePeliculas = new ArrayList<>(Arrays.asList(
                        new PeliculaSerie("El Temblor 1", "2018-02-27", 3),
                        new PeliculaSerie("El Temblor 2", "2021-03-17", 2),

                        new PeliculaSerie("Harry Potter 1", "2000-03-17", 4),
                        new PeliculaSerie("Harry Potter 2", "2002-03-17", 3),
                        new PeliculaSerie("Harry Potter 3", "2006-03-17", 4),
                        new PeliculaSerie("Harry Potter 4", "2011-03-17", 4),
                        new PeliculaSerie("Harry Potter 5", "2015-03-17", 5),

                        new PeliculaSerie("Rapido y Furioso 1", "2015-03-17", 5),
                        new PeliculaSerie("Rapido y Furioso 2", "2015-03-17", 3),
                        new PeliculaSerie("Rapido y Furioso 3", "2015-03-17", 3),
                        new PeliculaSerie("Rapido y Furioso 4", "2015-03-17", 2),
                        new PeliculaSerie("Rapido y Furioso 30", "2015-03-17", 1),

                        new PeliculaSerie("La Esclava", "1999-05-16", 2),
                        new PeliculaSerie("La Huerfana 1", "2010-09-17", 4),
                        new PeliculaSerie("La Huerfana 2", "2011-12-17", 5),
                        new PeliculaSerie("La Huerfana 3", "2012-11-17", 3),
                        new PeliculaSerie("La Huerfana 4", "2016-01-17", 4),

                        new PeliculaSerie("La Huerfana 1", "2015-03-17", 5),
                        new PeliculaSerie("La Huerfana 1", "2015-03-17", 4),
                        new PeliculaSerie("La Huerfana 1", "2015-03-17", 3),
                        new PeliculaSerie("La Huerfana 1", "2015-03-17", 5)
                ));
            return listaDePeliculas;
        }



}
