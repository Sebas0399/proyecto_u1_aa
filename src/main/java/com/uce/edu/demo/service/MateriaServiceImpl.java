package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;
@Service
public class MateriaServiceImpl implements IMateriaService{
	@Autowired
	private IMateriaRepository materiaRepo;
	
	
	@Override
	public void ingrersarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertar(m);
	}

	@Override
	public Materia buscarPorMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepo.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizar(m);
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminar(nombre);
	}

}
