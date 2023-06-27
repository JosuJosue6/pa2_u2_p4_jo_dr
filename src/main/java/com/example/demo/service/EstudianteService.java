package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void agregar(Estudiante estudiante); 
	public void actualizar(Estudiante estudiante);
	public void borrar(String cedula);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscarPorApellido(String apellido);
	public List<Estudiante> reportePorApellido(String apellido);
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre);
	public Estudiante buscarPorApellidoTyped(String apellido);
	public Estudiante buscarPorApellidoNamed(String apellido);
}
