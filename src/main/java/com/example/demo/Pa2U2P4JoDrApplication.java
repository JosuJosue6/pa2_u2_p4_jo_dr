package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		/*Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Rivas");
		estudiante.setNombre("Diego");
		estudiante.setCedula("246");
		
		this.estudianteService.agregar(estudiante);*/
		
		/*System.out.println("\nQuery");
		System.out.println(this.estudianteService.buscarPorApellido("Rivas"));
		
		System.out.println("\nQuery Reporte");
		List<Estudiante> estudiante2 = this.estudianteService.reportePorApellido("Ocapana");
		for(Estudiante estu: estudiante2) {
			System.out.println(estu);
		}
		
		
		System.out.println("\nQuery nombre y apellido");
		System.out.println(this.estudianteService.buscarPorApellidoyNombre("Rivas", "Diego"));
		
		System.out.println("\nTypedQuery");
		System.out.println(this.estudianteService.buscarPorApellidoTyped("Rivas"));
		*/
		System.out.println("\nNamedQuery");
		System.out.println(this.estudianteService.buscarPorApellidoNamed("Rivas"));		
	}

}
