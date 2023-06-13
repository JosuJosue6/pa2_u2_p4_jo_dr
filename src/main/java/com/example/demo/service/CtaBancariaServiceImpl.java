package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CtaBancariaRepository;
import com.example.demo.repository.modelo.CtaBancaria;

@Service
public class CtaBancariaServiceImpl implements CtaBancariaService{
	
	@Autowired
	private CtaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("impar")
	private AumentoService aumentoService;

	@Override
	public void apertura(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = bancaria.getFechaApertura();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = localDate.format(formatter);
		String [] split = formattedString.split(" ");
		String dia = split[0];
		
		int diaN = Integer.parseInt(dia);
		
		BigDecimal saldo = bancaria.getSaldo();
		BigDecimal montoAumento = this.aumentoService.incremetar(saldo);
		bancaria.setSaldo(montoAumento);
		
		

		this.bancariaRepository.insertar(bancaria);
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(id);
	}

	@Override
	public CtaBancaria consultarSaldo(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionar(id);
	}
	
	

}
