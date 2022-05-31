package com.uce.edu.demo.almacen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaAlmacen {
	@Autowired
	Articulo articulo;
	@Autowired
	ClienteAlmacen cliente;
	public String vender(String nombre,String direccion,String telefono,String nombreProducto,double precioProducto) {
		this.cliente.setNombre(nombre);
		this.cliente.setDireccion(direccion);
		this.cliente.setTelefono(telefono);
		
		this.articulo.setNombre(nombreProducto);
		this.articulo.setPrecio(precioProducto);
		return "Venta realizada total= "+this.articulo.getPrecio();
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public ClienteAlmacen getCliente() {
		return cliente;
	}
	public void setCliente(ClienteAlmacen cliente) {
		this.cliente = cliente;
	}
}
