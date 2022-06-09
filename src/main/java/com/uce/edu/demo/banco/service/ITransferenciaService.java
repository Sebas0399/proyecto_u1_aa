package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
	public void actualizar(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
	public void eliminar(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
	public Transferencia buscar(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
}
