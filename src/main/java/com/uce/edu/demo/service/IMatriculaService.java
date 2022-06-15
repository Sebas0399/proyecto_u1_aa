package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	public void ingrersarMatricula(Matricula m);

	public Matricula buscarPorNumero(String numero);

	public void actualizarMatricula(Matricula m);

	public void eliminarMatricula(String numero);
}
