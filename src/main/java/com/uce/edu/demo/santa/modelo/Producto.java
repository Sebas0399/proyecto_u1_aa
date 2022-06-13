package com.uce.edu.demo.santa.modelo;

import java.math.BigDecimal;

public class Producto {
	private String nombre;
	private BigDecimal costo;
	private String codigo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return costo;
	}
	public void setPrecio(BigDecimal precio) {
		this.costo = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + costo + ", codigo=" + codigo + "]";
	}
	
}
