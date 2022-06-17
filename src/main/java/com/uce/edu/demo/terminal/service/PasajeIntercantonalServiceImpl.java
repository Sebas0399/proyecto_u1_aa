package com.uce.edu.demo.terminal.service;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.terminal.modelo.Pasaje;

@Service
@Qualifier("intercantonal")
public class PasajeIntercantonalServiceImpl implements IPasajeService {

	@Override
	public BigDecimal precioFinal(Pasaje pasaje) {
		// TODO Auto-generated method stub
		BigDecimal pasajeRaw = pasaje.getPrecio();
		if (pasaje.getFecha().getHour() > 22 || pasaje.getFecha().getHour() < 5) {
			System.out.println("Tarifa Nocturna");
			return pasajeRaw.add(pasajeRaw.multiply(PORCENTAJE_IVA)).add(pasajeRaw.multiply(PORCENTAJE_TARIFA_NOCTURNA))
					.round(new MathContext(2));
		} else {
			System.out.println("Tarifa Normal");
			return pasajeRaw.add(pasajeRaw.multiply(PORCENTAJE_IVA)).round(new MathContext(2));
		}

	}

}
