package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private LocalDateTime fechaRetiro;
	private String numeroCuenta;
	private BigDecimal monto;
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}
	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Retiro [fechaRetiro=" + fechaRetiro + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + "]";
	}
	
}
