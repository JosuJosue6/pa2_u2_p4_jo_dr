package com.example.demo.repository;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionRepository {

	public void insertar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public void eliminarPorNumero(Integer idHabitacion);

	public Habitacion seleccionarPorNumero(Integer idHabitacion);
}
