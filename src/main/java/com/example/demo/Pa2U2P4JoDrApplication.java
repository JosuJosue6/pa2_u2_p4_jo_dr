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
		
		
		//MAIN
		/*Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Apellido 1");
		estudiante1.setNombre("Nombre 1");
		estudiante1.setCedula("123456");
		estudiante1.setPeso(65.7);
		
		this.estudianteService.agregar(estudiante1);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Apellido 2");
		estudiante2.setNombre("Nombre 2");
		estudiante2.setCedula("123456 -2");
		estudiante2.setPeso(120.5);
		
		this.estudianteService.agregar(estudiante2);*/
		
		System.out.println("Criteri API Query Estudiante dinamico MENOR");
		System.out.println(this.estudianteService.buscarEstudianteDinamico("Nombre 1","Apellido 1",50.0));
		
		
		System.out.println("Criteri API Query Estudiante dinamico MAYOR");
		System.out.println(this.estudianteService.buscarEstudianteDinamico("Nombre 1","Apellido 1",115.0));
		
	
		System.out.println("Eliminar por Nombre");
		System.out.println(this.estudianteService.borrarPorNombre("Josue"));
		
		System.out.println("Actualizar por Apellido");
		System.out.println(this.estudianteService.actualizarPorApellido("Alexander","Rivas"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		/*
		  
		
		System.out.println("\nNamedQuery con typed");
		System.out.println(this.estudianteService.buscarPorApellidoNamed("Rivas"));		
		
		System.out.println("\nNamedQuery Normal");
		System.out.println(this.estudianteService.buscarPorApellidoNamedQuery("Rivas"));
		
		System.out.println("\nNamedQuery Native");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQuery("Rivas"));
		
		System.out.println("\nNative QUery Named");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQueryNamed("Rivas"));
		
		System.out.println("Nombre NamedQuery");
		System.out.println(this.estudianteService.buscarPorNombreNamedQuery("Diego"));
		
		System.out.println("Nombre NativeQueryNamed");
		System.out.println(this.estudianteService.buscarPorNombreNativeQueryNamed("Diego"));
		
		System.out.println("Criteri API Query");
		System.out.println(this.estudianteService.buscarPorApellidoCriteriaAPIQuery("Rivas"));
		 */
	}

}
