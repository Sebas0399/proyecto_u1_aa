package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
@Service
public class DepositoServiceImpl implements IDepositoService{
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoRepository depositoRepo;
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino=this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino=ctaDestino.getSaldo();
		BigDecimal saldoFinal=saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito deposito=new Deposito();
		deposito.setFechaDeposito(LocalDateTime.now());
		deposito.setNumeroCuenta(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepo.insertarDeposito(deposito);
	}
	@Override
	public Deposito buscar(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepo.buscar(numeroCtaDestino);
	}
	@Override
	public void eliminar(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepo.eliminar(numeroCtaDestino);
	}
	@Override
	public void actualizar(String numeroCtaDestino, BigDecimal monto,LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Deposito d=new Deposito();
		d.setFechaDeposito(LocalDateTime.now());
		d.setMonto(monto);
		d.setNumeroCuenta(numeroCtaDestino);
		this.depositoRepo.actualizar(d);
	}

}
