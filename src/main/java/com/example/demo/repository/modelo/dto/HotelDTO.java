package com.example.demo.repository.modelo.dto;

public class HotelDTO {
	
	private String nombre;

	public HotelDTO(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public HotelDTO() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "HotelDTO [nombre=" + nombre + "]";
	}
	
	
	
	
	

}
