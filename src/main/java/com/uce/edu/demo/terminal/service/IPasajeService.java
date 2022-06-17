package com.uce.edu.demo.terminal.service;

import java.math.BigDecimal;

import com.uce.edu.demo.terminal.modelo.Pasaje;

public interface IPasajeService {
	public static BigDecimal PORCENTAJE_TARIFA_NOCTURNA=new BigDecimal(0.25);
	public static BigDecimal PORCENTAJE_IVA=new BigDecimal(0.12);
	public static BigDecimal TARIFA_SALIDA_PROVINCIA=new BigDecimal (0.50);
	public BigDecimal precioFinal(Pasaje pasaje);
}
