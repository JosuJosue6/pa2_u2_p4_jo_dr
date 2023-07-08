package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.dto.LibroDTO;

public interface LibroService {
	public void agregar(Libro libro);

	public void actualizar(Libro libro);

	public void borrar(Integer id);

	public Libro buscarPorId(Integer id);
	
	public void agregarAutor(Integer id);
	
	public List<LibroDTO> buscarDTO();
	
	
}
