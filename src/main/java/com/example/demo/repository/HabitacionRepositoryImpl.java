package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements HabitacionRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
	}

	@Override
	public void eliminarPorNumero(Integer idHabitacion) {
		// TODO Auto-generated method stub
		Habitacion habitacion = this.seleccionarPorNumero(idHabitacion);
		this.entityManager.remove(habitacion);
	}

	@Override
	public Habitacion seleccionarPorNumero(Integer idHabitacion) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, idHabitacion);
	}

}
