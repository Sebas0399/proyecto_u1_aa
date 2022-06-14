package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {
	@Autowired
	private ICuentaBancariaRepository bancariaRepo;
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceAhorros;
	
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService bancariaServiceFuturo;

	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.bancariaRepo.buscar(numeroCuenta);
		if (cta.getTipo().equals("A")) {
			// Ahorros
			interes = this.bancariaServiceAhorros.calcularInteres(numeroCuenta, cta.getSaldo());
		}
		 else if(cta.getTipo().equals("F")) {
				interes = this.bancariaServiceFuturo.calcularInteres(numeroCuenta, cta.getSaldo());

		}
		else {
			// Corriente
			interes = this.bancariaService.calcularInteres(numeroCuenta, cta.getSaldo());
		}
		return interes;
	}

}
