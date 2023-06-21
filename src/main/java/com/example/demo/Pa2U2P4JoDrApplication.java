package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private MatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		//ENTONCES NOSOTROS VEMOS EN LA DB LA CANTIDAD DE LIBROS DE DIHCO AUTOR. :)
		
		Matricula matricula = new Matricula();
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Pablito");
		
		Materia materia = new Materia();
		materia.setNombre("Optimizacion");
		
		matricula.setMateria(materia);
		matricula.setAlumno(alumno);
		matricula.setFecha(LocalDateTime.now());
		matricula.setNumero("2");
		
		List<Matricula> matriculas = new ArrayList<>();
		matriculas.add(matricula);
		alumno.setMatriculas(matriculas);
		materia.setMatriculas(matriculas);
		
		this.matriculaService.agregar(matricula);
		
	}

}
