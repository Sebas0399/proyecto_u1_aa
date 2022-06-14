package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITrasnferenciaRepository;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
	
	//como la logica de CuentaBancariaService no hace nada
	//Si puedo Iyectar el CuentaBancariaRepository
    @Autowired
    @Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
    
    @Autowired
    private ITrasnferenciaRepository iTransferenciaRepository;
    
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen=this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal NuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(NuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.iTransferenciaRepository.insertar(t);
		
		
		
		
	}

	@Override
	public void actualizar(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		Transferencia t=new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(monto);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setNumeroCuentaOrigen(ctaOrigen);
		this.iTransferenciaRepository.actualizar(t);
	
	
	}

	@Override
	public void eliminar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminar(cuentaOrigen, cuentaDestino);
	}

	@Override
	public Transferencia buscar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		return this.iTransferenciaRepository.buscar(cuentaOrigen, cuentaDestino);
		// TODO Auto-generated method stub
		
	}

}