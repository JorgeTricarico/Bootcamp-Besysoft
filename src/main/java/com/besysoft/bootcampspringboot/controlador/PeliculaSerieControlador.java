package com.besysoft.bootcampspringboot.controlador;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaSerie;
import com.besysoft.bootcampspringboot.utilidades.GeneradorDummyn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peliculas")
public class PeliculaSerieControlador {

    @GetMapping
    public List<PeliculaSerie> mostrarTodas() {

        return GeneradorDummyn.listaDePeliculas;
    }

    @GetMapping("/{titulo}")
    public List<PeliculaSerie> buscarPorTitulo(@PathVariable String titulo) {
        if (titulo == null) {
            throw new NullPointerException("Título no puede ser nulo.");
        }

        // Valida letras y numeros para peliculas con numeros.
        Boolean sonSoloLetras = titulo.matches("^[a-zA-Z0-9 ]+$");

        if (!sonSoloLetras) {
            throw new IllegalArgumentException("Ingrese un titulo valido");
        }

        List<PeliculaSerie> peliculasSeries = GeneradorDummyn.listaDePeliculas.stream()
                .filter(pelis -> pelis.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());



        if (peliculasSeries.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return peliculasSeries;
    }

    @GetMapping("/genero/{nombreGenero}")
    public List<Genero> buscarPorGenero(@PathVariable String nombreGenero) {

        if (nombreGenero == null) {
            throw new NullPointerException("Genero no puede ser nulo.");
        }

        Boolean sonSoloLetras = nombreGenero.matches("^[a-zA-Z ]+$");

        if (!sonSoloLetras) {
            throw new IllegalArgumentException("Ingrese un genero valido");
        }

        List<Genero> genero = GeneradorDummyn.listaDeGeneros.stream()
                .filter(gen -> gen.getNombre().toLowerCase().
                        contains(nombreGenero.toLowerCase())).
                         collect(Collectors.toList());

        /*List<String> listaPeliculasSeries = new ArrayList<>();

        GeneradorDummyn.listaDeGeneros.stream().
                forEach(genero -> {
                    if (genero.getNombre().equalsIgnoreCase(nombreGenero)){
                        listaPeliculasSeries.addAll(genero.getPeliculaSerie());
                    }
                });*/

        if (genero.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return genero;
    }


}