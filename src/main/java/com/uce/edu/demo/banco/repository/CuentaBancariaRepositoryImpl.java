package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta bancaria actualizada a: "+cuenta);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: "+numero);
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("F");
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta bancaria insertada en la base: "+cuenta);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta bancaria eliminada de la base de numero: "+numero);
		
	}

}
