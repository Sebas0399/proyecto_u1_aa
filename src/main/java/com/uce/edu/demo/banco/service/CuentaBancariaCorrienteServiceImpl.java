package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteServiceImpl implements ICuentaBancariaService{
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta,BigDecimal saldo) {
		
		BigDecimal interes=saldo.multiply(new BigDecimal(15).divide(new BigDecimal(100)));
		
		return interes;
	}

}
