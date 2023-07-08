package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.dto.HotelDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HotelRepositoryImpl implements HotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {

		this.entityManager.persist(hotel);

	}

	@Override
	public Hotel seleccionarPorId(Integer id) {

		return this.entityManager.find(Hotel.class, id);

	}

	@Override
	public void actualizar(Hotel hotel) {

		this.entityManager.merge(hotel);

	}

	@Override
	public void eliminarPorId(Integer id) {

		Hotel hotel = this.seleccionarPorId(id);

		this.entityManager.remove(hotel);

	}
	@Override
	public List<HotelDTO> selecionarTodosDTO() {
		TypedQuery<HotelDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.HotelDTO(h.nombre) FROM Hotel h ",
				HotelDTO.class);
		List<HotelDTO> f = myQuery.getResultList();

		return f;
	}

}
