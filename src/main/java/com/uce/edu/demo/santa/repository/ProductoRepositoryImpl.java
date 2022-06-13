package com.uce.edu.demo.santa.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.santa.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("Se he ingresado el producto: "+producto);
	}

	@Override
	public Transferencia buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha encontrado el producto de codigo: "+codigo);
		return null;
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el producto: "+producto);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto con codigo: "+codigo);
	}
	
}
