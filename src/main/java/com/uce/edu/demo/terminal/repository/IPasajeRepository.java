package com.uce.edu.demo.terminal.repository;

import com.uce.edu.demo.terminal.modelo.Pasaje;

public interface IPasajeRepository {
	//CRUD
	//c: Create
	public void insertar(Pasaje p);

	// R: Read
	public Pasaje buscar(String id);

	// U: Update
	public void actualizar(Pasaje p);

	// D: Delete
	public void eliminar(String id);
}
