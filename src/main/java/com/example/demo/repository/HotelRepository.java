package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {

	public void ingresar(Hotel hotel);
	
	public void actualizar(Hotel habitacion);
	
	public void eliminarPorId(Integer id);
	
	public Hotel seleccionarPorId(Integer id);
}
