package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepository {
	//CRUD
	//c: Create
	public void insertar(Estudiante e);

	// R: Read
	public Estudiante buscar(String apellido);

	// U: Update
	public void actualizar(Estudiante e);

	// D: Delete
	public void eliminar(String cedula);
}
