package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void agregar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.ingresar(hotel);
	}

	@Override
	public void actualizar(Hotel habitacion) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(habitacion);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminarPorId(id);
	}

	@Override
	public Hotel buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorId(id);
	}

}
