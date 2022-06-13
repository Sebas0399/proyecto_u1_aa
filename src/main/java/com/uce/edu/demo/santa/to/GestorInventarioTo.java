package com.uce.edu.demo.santa.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GestorInventarioTo {
	private String nombre;
	private int cantidad;
	private BigDecimal precio;
	private LocalDateTime fechaIngreso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "GestorInventarioTo [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}
