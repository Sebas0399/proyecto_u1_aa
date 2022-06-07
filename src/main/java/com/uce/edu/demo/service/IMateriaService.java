package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	public void ingrersarMateria(Materia m);

	public Materia buscarPorMateria(String nombre);

	public void actualizarMateria(Materia m);

	public void eliminarMateria(String nombre);
}
