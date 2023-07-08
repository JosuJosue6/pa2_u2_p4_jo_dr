package com.example.demo.repository.modelo.dto;

public class EstudianteDTO {
	//vamos a crear con el nombre y el apellido
	//1.-Crear  un OBJ DTO exclusivamente con los atributos que necesito consultar
	//Nombre y Apellido en este caso:
	
	private String nombre;
	private String apellido;
	
	
	/*2.-Debe tener un Constructor que debe recibir lo de 1.-
	 * 
	 */
	public EstudianteDTO(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	/*3.-Cuando pongo un Constructor diferente al por defecto
	 * alli si tengo que PONER EL CONSTRUCTOR POR DEFECTO
	 */
	public EstudianteDTO() {
		
	}
	
	//DTO Para transferirse entre capas (Se usa para web service o para la red)
	//Debe tener la Interfaz serializable
	
	
	
	//GETTERS Y SETTERS
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

	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	

}
