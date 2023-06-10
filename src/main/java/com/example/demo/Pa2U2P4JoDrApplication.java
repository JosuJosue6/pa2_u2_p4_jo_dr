package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estu = new Estudiante();
		estu.setApellido("Ocapana");
		estu.setNombre("Josue");
		estu.setCedula("1720525516");
		
		//this.estudianteService.agregar(estu);
		
		//Estudiante estu2 = new Estudiante();
		//estu2.setApellido("Rivas");
		//estu2.setNombre("Diego");
		//estu2.setCedula("1725051146");
		
		//this.estudianteService.agregar(estu2);
		this.estudianteService.buscarPorCedula(estu.getCedula());
		estu.setNombre("Anderson");
		this.estudianteService.actualizar(estu);
		this.estudianteService.borrar(estu.getCedula());
	
	}

}
