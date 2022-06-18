package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService{
	@Autowired
	private IMatriculaRepository matriculaRepo;
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	@Override
	public void ingrersarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde service SINGLETON"+this.profesorGeneral);
		
		System.out.println("DI desde service PROTOTYPE"+this.profesorMateria);

		System.out.println("DI desde metodo"+this.obtenerProfesorG());
		System.out.println("DI desde metodo"+this.obtenerProfesorM());
	}
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		
		return null;
	}
	00@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM=new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		return profeM;
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