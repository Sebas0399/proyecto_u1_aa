package com.uce.edu.demo.consesionario;

import org.springframework.stereotype.Component;

@Component
public class Auto {
	private String marca;
	private double precio;
	private String placa;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
