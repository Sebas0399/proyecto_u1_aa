package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class TrasferenciaRepositoryImpl implements ITrasnferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia insertada:"+t);
	}

}
