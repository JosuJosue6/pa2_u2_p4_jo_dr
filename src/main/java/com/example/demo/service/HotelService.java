package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {

	public void agregar(Hotel hotel);
	
	public void actualizar(Hotel habitacion);
	
	public void borrarPorId(Integer id);
	
	public Hotel buscarPorId(Integer id);
}
