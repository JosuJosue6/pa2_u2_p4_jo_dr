package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CtaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CtaBancariaRepositoryImpl implements CtaBancariaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CtaBancaria bancaria) {
		this.entityManager.persist(bancaria);
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		CtaBancaria bancaria = this.seleccionar(id);
		this.entityManager.merge(bancaria);
	}

	@Override
	public CtaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CtaBancaria.class, id);
	}

}
