package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;

public interface AutorService {
	
	public void agregar(Autor autor);

	public void actualizar(Autor autor);

	public void borrar(Integer id);

	public Autor buscarPorId(Integer id);

}
