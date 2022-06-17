package com.uce.edu.demo.terminal.repository;

import com.uce.edu.demo.terminal.modelo.Bus;

public class BusRepositoryImpl implements IBusRepository {

	@Override
	public void insertar(Bus b) {
		// TODO Auto-generated method stub
		System.out.println("Bus insertado: "+b);
	}

	@Override
	public Bus buscar(String patente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Bus b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String patente) {
		// TODO Auto-generated method stub
		
	}

}
