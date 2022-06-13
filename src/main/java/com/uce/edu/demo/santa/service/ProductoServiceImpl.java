package com.uce.edu.demo.santa.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santa.modelo.Producto;
import com.uce.edu.demo.santa.repository.IProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoRepository productoRepo;
	@Override
	public void insertar(String codigo,String nombre,BigDecimal precio) {
		Producto producto=new Producto();
		producto.setNombre(nombre);
		producto.setCodigo(codigo);
		producto.setPrecio(precio);
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

}
