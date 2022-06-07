package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IEstudianteRepository;
@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepository estuRepo;
	
	@Override
	public void ingrersarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.estuRepo.insertar(e);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscar(apellido);
	}

	@Override
	public void actualizarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.estuRepo.actualizar(e);
	}

	@Override
	public void eliminarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estuRepo.eliminar(cedula);
	}

}
