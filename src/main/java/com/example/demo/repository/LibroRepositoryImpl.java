package com.example.demo.repository;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.dto.LibroDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository()
@Transactional
public class LibroRepositoryImpl implements LibroRepository{
		
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libro libro = this.seleccionarPorId(id);
		this.entityManager.remove(libro);
	}

	@Override
	public Libro seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public List<LibroDTO> seleccinarDTO() {
		TypedQuery<LibroDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.LibroDTO(l.titulo, t.editoreial) FROM Libro l ",
				LibroDTO.class);
		List<LibroDTO> f = myQuery.getResultList();

		return f;
	}

}
