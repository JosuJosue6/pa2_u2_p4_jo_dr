package com.example.demo.repository;

import com.example.demo.repository.modelo.Autor;

public interface AutorRepository {
	
	public void insertar(Autor autor);

	public void actualizar(Autor autor);

	public void eliminar(Integer id);

	public Autor seleccionarPorId(Integer id);
}
