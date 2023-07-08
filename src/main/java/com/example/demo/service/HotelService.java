package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.dto.HotelDTO;

public interface HotelService {
	
	 public void insertar(Hotel hotel);

	 

	    public Hotel seleccionarPorId(Integer id);

	 

	    public void actualizar(Hotel hotel);

	 

	    public void eliminarPorId(Integer id);
	    
	    public List<HotelDTO> buscarTodosDTO();

}
