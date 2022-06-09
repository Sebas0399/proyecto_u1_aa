package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITrasnferenciaRepository {
	public void insertar (Transferencia transferencia);
	public Transferencia buscar(String cuentaOrigen,String cuentaDestino);
	public void actualizar(Transferencia transferencia);
	public void eliminar(String cuentaOrigen,String cuentaDestino);
}
