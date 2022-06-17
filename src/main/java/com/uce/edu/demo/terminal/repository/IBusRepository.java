package com.uce.edu.demo.terminal.repository;

import com.uce.edu.demo.terminal.modelo.Bus;

public interface IBusRepository {
	//CRUD
		//c: Create
		public void insertar(Bus b);

		// R: Read
		public Bus buscar(String patente);

		// U: Update
		public void actualizar(Bus b);

		// D: Delete
		public void eliminar(String patente);
}
