package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LibroRepository;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.dto.LibroDTO;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroRepository;
	
	@Override
	public void agregar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.insertar(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.actualizar(libro);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.libroRepository.eliminar(id);
	}

	@Override
	public Libro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccionarPorId(id);
	}

	@Override
	public void agregarAutor(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LibroDTO> buscarDTO() {
		// TODO Auto-generated method stub
		return this.libroRepository.seleccinarDTO();
	}

}
