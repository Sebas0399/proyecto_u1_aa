package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	public void insertarDeposito(Deposito deposito);
	public void actualizar(Deposito deposito);
	public Deposito buscar(String numeroCuenta);
	public void eliminar(String numeroCuenta);
	public List<Deposito> consular(String cuenta,LocalDateTime fechaInicio,LocalDateTime fechaFin);

}
