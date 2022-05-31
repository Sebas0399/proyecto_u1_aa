package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//Inversion de control
@Component
public class Paciente {
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	private int edad;
}
