package com.uce.edu.demo.santa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santa.modelo.Inventario;
import com.uce.edu.demo.santa.modelo.Producto;
import com.uce.edu.demo.santa.repository.IInventarioRepository;
import com.uce.edu.demo.santa.repository.IProductoRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	@Autowired
	private IProductoRepository productoRepo;
	@Autowired
	private IInventarioRepository inventarioRepo;

	@Override
	public void insertar(String codigo,String nombre,BigDecimal precio,Integer cantidad,LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		Producto producto=new Producto();
		producto.setNombre(nombre);
		producto.setCodigo(codigo);
		producto.setPrecio(precio);
		this.productoRepo.insertar(producto);
		Inventario inventario=new Inventario();
		inventario.setCantidad(cantidad);
		inventario.setProducto(producto);
		inventario.setFechaIngreso(fechaIngreso);
		this.inventarioRepo.insertar(inventario);
	
		
	}

}
