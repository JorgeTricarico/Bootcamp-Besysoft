package com.besysoft.bootcampspringboot;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.utilidades.GeneradorDummyn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BootcampSpringBootApplication {

	@Autowired
	static GeneradorDummyn generadorDummyn;
	public static List<Genero> listaGeneros =  generadorDummyn.crearDatosGenero();
	public static void main(String[] args) {


		SpringApplication.run(BootcampSpringBootApplication.class, args);

		System.out.println(listaGeneros);
	}

}
