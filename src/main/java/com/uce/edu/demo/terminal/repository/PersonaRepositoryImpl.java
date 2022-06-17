package com.uce.edu.demo.terminal.repository;

import com.uce.edu.demo.terminal.modelo.Persona;

public class PersonaRepositoryImpl implements IPersonaRepository{

	@Override
	public void insertar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Persona insertada: "+p);
	}

	@Override
	public Persona buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}
	
}
