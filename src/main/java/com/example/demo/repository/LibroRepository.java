package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.dto.LibroDTO;

public interface LibroRepository {
	
	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	public Libro seleccionarPorId(Integer id);
	
	public List<LibroDTO> seleccinarDTO(); 
	//SI ES UNA LISTA HACER UN SIZE cuando engo la carga pereZOSA )ES UNA SEÑAL
}	
