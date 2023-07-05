package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estudiante = this.seleccionar(cedula);
		this.entityManager.remove(estudiante);

	}

	@Override
	public Estudiante seleccionar(String cedula) {

		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		// SELECT * from estudiante where estu_apellido = apellido;
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido ( se convierte en
		// variable por el dato que viene
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido) {
		// TODO Auto-generated method stub
		// Construye desde 0
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// 1.- Especificar el ytipo de retorno que tiene mi Query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// 2.- Empezamos a crear el sql
		// 2.1.- Definimos el FROM (Root).......... En este caso el from y el retorno
		// son los mismos(estudiantes) pero no siempre es asi
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);// el from es Estudiante

		// 3.- Construir las condiciones de mi SQL
		// dentro de Criteria API las condiciones se las conoce como predicados
		// Cada condicion es un predicado
		// e.apellido = :datoApellido
		Predicate condicionApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		// El 1ro argumento referencia al Atributo de la Entidad
		// El 2do es el argumento del Metodo lo que quiero comaprar

		// 4.-Armamos el SQL final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery); // Puedo pasar eun objeto
																								// Criteria Queri
		// 5.-La ejecucion del Query lo realizamos con Typed
		return myQueryFinal.getSingleResult();

	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// 1.- Especificar el ytipo de retorno que tiene mi Query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// 2.- Empezamos a crear el sql
		// 2.1.- Definimos el FROM (Root).......... En este caso el from y el retorno
		// son los mismos(estudiantes) pero no siempre es asi
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);// el from es Estudiante

		// 3.- Construir las condiciones
		// Construccion dinamica
		// peso > 100 e.nombre = ? AND e.apellido = ?
		// peso <= 100 e.nombre = ? OR e.apellido = ?

		// e.nombre
		Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);

		// e.apellido
		Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		// if((peso.compareTo(new Double(0)) <= 0))<= 0{// se raya el double cuando es
		// innecesario o esta obsoleto

		// }
		Predicate predicadoFinal = null;

		if (peso.compareTo(Double.valueOf(100)) <= 0) {
			predicadoFinal = myBuilder.or(pNombre, pApellido);
		} else {
			predicadoFinal = myBuilder.and(pNombre, pApellido);
		}

		// 4.-Armamos el SQL final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery); // Puedo pasar eun objeto
																								// Criteria Queri
		// 5.-La ejecucion del Query lo realizamos con Typed
		return myQueryFinal.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// DELETE from estudiante where estu_nombre = ?
		// DELETE from Estudiante e where e.nombre = :datoNombre
		Query myQuery = this.entityManager.createQuery("DELETE from Estudiante e where e.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.executeUpdate();// numero de registros afectados
	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		// UPDATE estudiante SET estu_nombre = ? WHERE estu_apellido = ?
		//UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido
		Query myQuery = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();// numero de registros afectados
	}

}
