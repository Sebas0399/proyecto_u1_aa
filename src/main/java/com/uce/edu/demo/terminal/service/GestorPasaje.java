package com.uce.edu.demo.terminal.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.terminal.modelo.Pasaje;
import com.uce.edu.demo.terminal.modelo.PasajeInterporvincial;
import com.uce.edu.demo.terminal.repository.IPasajeRepository;
@Service
public class GestorPasaje {
	@Autowired
	@Qualifier("intercantonal")
	private IPasajeRepository repoPasajeCantonal;

	@Autowired
	@Qualifier("interprovincial")
	private IPasajeRepository repoPasajeProvincial;

	@Autowired
	@Qualifier("intercantonal")
	private IPasajeService servicePasajeCantonal;
	@Autowired
	@Qualifier("interprovincial")
	private IPasajeService servicePasajaProvincial;

	public void registarPasaje(Pasaje p) {
		if (p.getClass().equals(PasajeInterporvincial.class)) {
			this.repoPasajeProvincial.insertar(p);
		} else {
			this.repoPasajeCantonal.insertar(p);

		}

	}

	public BigDecimal cobrarPasaje(Pasaje p) {
		if (p.getClass().equals(PasajeInterporvincial.class)) {
			return this.servicePasajaProvincial.precioFinal(p);
		} else {
			return this.servicePasajeCantonal.precioFinal(p);

		}
	}
}
