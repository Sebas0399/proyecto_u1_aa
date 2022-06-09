package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl implements IRetiroService{
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepo;
	@Override
	public void realizar(String numeroCta,BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen=this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCtaOrigen=ctaOrigen.getSaldo();
		BigDecimal saldoFinal=saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaOrigen);
		
		Retiro retiro=new Retiro();
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCta);
		retiro.setMonto(monto);
		this.retiroRepo.insertar(retiro);
	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		return this.retiroRepo.buscar(numero);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepo.actualizar(r);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.retiroRepo.eliminar(numero);
	}

}
