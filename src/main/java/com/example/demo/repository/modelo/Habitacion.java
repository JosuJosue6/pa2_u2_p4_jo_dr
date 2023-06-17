package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Habitacion {
	
	private Integer id;
	
	//atributos logicos que el usuario conoce
	private String numero;
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;
	
	//SET Y GET
	
	public String getNumero() {
		return numero;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
}
