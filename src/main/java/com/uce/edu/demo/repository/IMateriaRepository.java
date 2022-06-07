package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	//CRUD
		//c: Create
		public void insertar(Materia m);

		// R: Read
		public Materia buscar(String nombre);

		// U: Update
		public void actualizar(Materia m);

		// D: Delete
		public void eliminar(String nombre);
}
