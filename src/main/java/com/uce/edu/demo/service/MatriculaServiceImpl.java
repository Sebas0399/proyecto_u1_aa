package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService{
	@Autowired
	private IMatriculaRepository matriculaRepo;
	@Override
	public void ingrersarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(m);
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepo.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizar(m);
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepo.eliminar(numero);
	}

}
