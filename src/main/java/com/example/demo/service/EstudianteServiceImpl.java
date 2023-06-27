package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(cedula);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionar(cedula);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> reportePorApellido(String apellido) {
		// TODO Auto-generated method stub
	
		
		return this.estudianteRepository.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoNamed(apellido);
	}
	
	

}
