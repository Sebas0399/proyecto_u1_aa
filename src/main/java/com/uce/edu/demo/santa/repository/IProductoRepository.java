package com.uce.edu.demo.santa.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.santa.modelo.Producto;
@Repository
public interface IProductoRepository {
	public void insertar (Producto producto);
	public Transferencia buscar(String codigo);
	public void actualizar(Producto producto);
	public void eliminar(String codigo);
}
