package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.dto.HotelDTO;

public interface HotelRepository {

	 
    // create, read, update delete

    public void insertar(Hotel hotel);

 

    public Hotel seleccionarPorId(Integer id);

 

    public void actualizar(Hotel hotel);

 

    public void eliminarPorId(Integer id);
    
    public List<HotelDTO> selecionarTodosDTO();
    
    

}