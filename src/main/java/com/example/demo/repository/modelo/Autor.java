package com.example.demo.repository.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	@GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@Id
	@Column(name = "aut_id")
	private Integer id;
	
	@Column(name = "aut_nombre")
	private String nombre;
	
	@Column(name = "aut_apellido")
	private String apellido;
	
	//A la lista la represento con un SET de libros
	@ManyToMany(mappedBy = "autores",cascade = CascadeType.ALL)
	private Set<Libro> libros;
	
   //SETTERS Y GETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	
	

}
