package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements HotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotelEncontrado = this.seleccionarPorId(id);
		this.entityManager.remove(hotelEncontrado);
	}

	@Override
	public Hotel seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel =  this.entityManager.find(Hotel.class, id);

        System.out.println("Numero de habitaciones: "+hotel.getHabitaciones().size());

        return hotel;
	}

}
