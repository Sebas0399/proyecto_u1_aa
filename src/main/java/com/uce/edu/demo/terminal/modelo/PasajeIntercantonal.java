package com.uce.edu.demo.terminal.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("intercantonal")

public class PasajeIntercantonal extends Pasaje{
	private String nombre;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
