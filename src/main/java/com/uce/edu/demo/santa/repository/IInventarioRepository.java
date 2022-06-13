package com.uce.edu.demo.santa.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.santa.modelo.Inventario;

public interface IInventarioRepository {
	//CRUD
	public void insertar (Inventario inventario);
	public Inventario buscar(String codigo);
	public void actualizar(Inventario transferencia);
	public void eliminar(String codigo);
	
	public List<Inventario> consultar(LocalDateTime fecha);
}
