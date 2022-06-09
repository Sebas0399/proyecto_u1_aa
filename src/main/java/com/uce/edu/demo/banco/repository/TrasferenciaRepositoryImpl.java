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

	@Override
	public Transferencia buscar(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia en contrada de: "+cuentaOrigen +"a "+cuentaDestino);
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia actualizada: "+transferencia);
	}

	@Override
	public void eliminar(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia eliminada de: "+cuentaOrigen +"a "+cuentaDestino);
	}

}
