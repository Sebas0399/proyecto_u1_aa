package com.uce.edu.demo.santa.modelo;

import java.time.LocalDateTime;

public class Inventario {
	private Producto producto;
	private int cantidad;
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private LocalDateTime fechaIngreso;


	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	@Override
	public String toString() {
		return "Inventario [producto=" + producto + ", cantidad=" + cantidad + ", fechaIngreso=" + fechaIngreso + "]";
	}

	
	
	
}
