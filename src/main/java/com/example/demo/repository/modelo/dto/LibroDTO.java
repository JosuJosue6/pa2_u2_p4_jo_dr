package com.example.demo.repository.modelo.dto;

public class LibroDTO {
	
	private String titulo;
	
	private String editorial;
	
	
	public LibroDTO() {
		
	}
	
	public LibroDTO(String titulo, String editorial) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
	}



	@Override
	public String toString() {
		return "LibroDTO [titulo=" + titulo + ", editorial=" + editorial + "]";
	}




	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	

}
