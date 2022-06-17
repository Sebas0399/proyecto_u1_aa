package com.uce.edu.demo.terminal.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.terminal.modelo.Pasaje;
@Repository
@Qualifier("intercantonal")
public class PasajeIntercantonaRepositorylmpl implements IPasajeRepository{

	@Override
	public void insertar(Pasaje p) {
		// TODO Auto-generated method stub
		System.out.println("Pasaje intercantonal insertado");

	}

	@Override
	public Pasaje buscar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Pasaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		
	}

}
