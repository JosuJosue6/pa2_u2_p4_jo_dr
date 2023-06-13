package com.example.demo.service;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaService {
	public void apertura(CtaBancaria bancaria);

	public void actualizar(Integer id);

	public CtaBancaria consultarSaldo(Integer id);
}
