package com.example.demo.repository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaRepository {
	public void insertar(CtaBancaria bancaria);

	public void actualizar(Integer id);

	public CtaBancaria seleccionar(Integer id);
}
