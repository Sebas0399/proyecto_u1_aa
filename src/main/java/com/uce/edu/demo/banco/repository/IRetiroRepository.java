package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IRetiroRepository {
	//CRUD
	public void insertar(Retiro r);
	public Retiro buscar(String numeroCuenta);
	public void actualizar(Retiro r);
	public void eliminar(String numeroCuenta);
	public List<Retiro> consular(String cuenta,LocalDateTime fechaInicio,LocalDateTime fechaFin);

}
