package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		/*
		Hotel hotel = new Hotel();

		Empleado empleado = new Empleado();
		hotel.setNombre("Hotel 3");
		hotel.setDireccion("America");

		Hotel hotelB = new Hotel();

		Empleado empleado1 = new Empleado();
		hotelB.setNombre("Hotel 4");
		hotelB.setDireccion("Borrar");

		System.out.println("\nAgregar Hotel a la DB");
		this.hotelService.insertar(hotel);
		this.hotelService.insertar(hotelB);
		
		Habitacion habitacion = new Habitacion();

		habitacion.setNumero("1A");
		habitacion.setValor(new BigDecimal(100));
		habitacion.setHotel(hotel);

		Habitacion habitacion2 = new Habitacion();

		habitacion2.setNumero("1B");
		habitacion2.setValor(new BigDecimal(100));
		habitacion2.setHotel(hotel);
		
		*/
		
        System.out.println("Busqueda DTO Estudiante");
		
		this.estudianteService.buscarTodosDTO().forEach(System.out::println);
		
		
		System.out.println("Busqueda DTO Matricula");
		
		this.matriculaService.buscarTodosDTO().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
