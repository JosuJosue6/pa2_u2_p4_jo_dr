package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.LibroService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private AutorService autorService;
	
	@Autowired
	private LibroService libroService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Autor autor = new Autor();
		autor.setApellido("Rivas");
		autor.setNombre("Diego");
		
		Libro libro = new Libro();
		libro.setEditorial("editorial UCE");
		libro.setTitulo("Mimir vol 1");
		
		Libro libro2 = new Libro();
		libro2.setEditorial("editorial UCE");
		libro2.setTitulo("Despertar vol 1");
		
		Set<Libro> libros = new HashSet<>();
		libros.add(libro);
		libros.add(libro2);
		
		autor.setLibros(libros);
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor);
		
		libro.setAutores(autores);
		libro2.setAutores(autores);
		
		this.autorService.agregar(autor);



		
		
	}

}
