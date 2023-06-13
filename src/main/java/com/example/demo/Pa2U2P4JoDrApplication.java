package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.service.CtaBancariaService;

@SpringBootApplication
public class Pa2U2P4JoDrApplication implements CommandLineRunner{
	
	@Autowired
	
	private CtaBancariaService bancariaService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CtaBancaria bancaria = new CtaBancaria();
		bancaria.setCedulaPropietario("1720525516");
		bancaria.setFechaApertura(LocalDate.now());
		bancaria.setNumero("123456");
		bancaria.setTipo("A");
		bancaria.setSaldo(new BigDecimal(50));
		
		this.bancariaService.apertura(bancaria);
		
	}

}
