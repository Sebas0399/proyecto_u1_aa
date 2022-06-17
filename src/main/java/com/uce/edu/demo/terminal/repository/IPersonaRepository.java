package com.uce.edu.demo.terminal.repository;

import com.uce.edu.demo.terminal.modelo.Persona;

public interface IPersonaRepository {
	//CRUD
	//c: Create
	public void insertar(Persona p);

	// R: Read
	public Persona buscar(String cedula);

	// U: Update
	public void actualizar(Persona p);

	// D: Delete
	public void eliminar(String cedula);
}
