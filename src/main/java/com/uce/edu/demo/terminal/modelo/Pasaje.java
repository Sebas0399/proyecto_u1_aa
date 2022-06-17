package com.uce.edu.demo.terminal.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pasaje {
	private String idPasaje;
	private String nroAsiento;
	private LocalDateTime fecha;
	private Bus bus;
	private Persona pasajero;
	private BigDecimal precio;
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Persona getPasajero() {
		return pasajero;
	}
	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
	
	public String getIdPasaje() {
		return idPasaje;
	}
	public void setIdPasaje(String idPasaje) {
		this.idPasaje = idPasaje;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getNroAsiento() {
		return nroAsiento;
	}
	public void setNroAsiento(String nroAsiento) {
		this.nroAsiento = nroAsiento;
	}
	@Override
	public String toString() {
		return "Pasaje [idPasaje=" + idPasaje + ", nroAsiento=" + nroAsiento + ", fecha=" + fecha + ", bus=" + bus
				+ ", pasajero=" + pasajero + ", precio=" + precio + "]";
	}
	
	
	
}
