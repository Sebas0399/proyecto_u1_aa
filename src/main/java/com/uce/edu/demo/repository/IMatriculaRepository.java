package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	//CRUD
		//c: Create
		public void insertar(Matricula m);

		// R: Read
		public Matricula buscar(String numero);

		// U: Update
		public void actualizar(Matricula m);

		// D: Delete
		public void eliminar(String numero);
}
