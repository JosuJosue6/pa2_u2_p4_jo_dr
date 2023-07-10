package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;

import jakarta.persistence.FetchType;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//insertar en la DB
		/*Hotel hotel1 = new Hotel();
		hotel1.setNombre("Hotel 1");
		hotel1.setDireccion("Av America");
		
		Hotel hotel2 = new Hotel();
		hotel2.setNombre("Hotel 2");
		hotel2.setDireccion("Av Simon");
		
		Hotel hotel3 = new Hotel();
		hotel3.setNombre("Hotel 3");
		hotel3.setDireccion("Av America - 3");
		
		Habitacion habitacion1 = new Habitacion()	;
		habitacion1.setNumero("1 A");
		habitacion1.setValor(new BigDecimal(200));
		habitacion1.setHotel(hotel1);
		
		Habitacion habitacion2 = new Habitacion()	;
		habitacion2.setNumero("1 S");
		habitacion2.setValor(new BigDecimal(100));
		habitacion2.setHotel(hotel2);
		
		Habitacion habitacion3 = new Habitacion()	;
		habitacion3.setNumero("1 S");
		habitacion3.setValor(new BigDecimal(10));
		habitacion3.setHotel(hotel2);
		
		List<Habitacion> habitacionesSimon = new ArrayList<>();
		habitacionesSimon.add(habitacion2);
		habitacionesSimon.add(habitacion3);
		
		hotel2.setHabitaciones(habitacionesSimon);
		
		List<Habitacion> habitacionesAmerica = new ArrayList<>();
		habitacionesAmerica.add(habitacion1);
		
		hotel1.setHabitaciones(habitacionesAmerica);
		
		this.hotelService.agregar(hotel1);
		this.hotelService.agregar(hotel2);
		this.hotelService.agregar(hotel3);*/
		System.out.println("\nBusqueda DTO Estudiante");
		
		this.estudianteService.buscarTodosDTO().forEach(System.out::println);
		
		
		System.out.println("\nBusqueda DTO Matricula");
		
		this.matriculaService.buscarTodosDTO().forEach(System.out::println);

		System.out.println("\nBuscar numero de habitaciones en hotel usando FetchType.LAZY");
		this.hotelService.buscarPorId(2).getHabitaciones();
	}

}
