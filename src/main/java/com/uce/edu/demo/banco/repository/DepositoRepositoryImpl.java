package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{
	@Override
	public void insertarDeposito(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+deposito);
	}

	@Override
	public void actualizar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actulizado el deposito:" +deposito);
	}

	@Override
	public Deposito buscar(String numeroCuenta) {
		System.out.println("Se busca el deposito a la cuenta bancaria: "+numeroCuenta);

		return null;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito a la cuenta: "+numeroCuenta);
	}

}
