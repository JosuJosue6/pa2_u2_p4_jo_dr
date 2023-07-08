package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.dto.HotelDTO;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public Hotel seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorId(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
		
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminarPorId(id);
		
	}

	@Override
	public List<HotelDTO> buscarTodosDTO() {
		// TODO Auto-generated method stub
		return this.hotelRepository.selecionarTodosDTO();
	}

}
