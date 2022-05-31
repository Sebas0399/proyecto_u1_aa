package com.uce.edu.demo.libreria;

import org.springframework.stereotype.Service;

@Service
public class VentaLibreria {
	private ClienteLibreria cliente;
	private Libro libro;

	public VentaLibreria(ClienteLibreria cliente, Libro libro) {
		this.cliente = cliente;
		this.libro = libro;
	}
	public String vender(String nombre, String direccion, String telefono, String nombreLibro, double precio) {

		this.cliente.setNombre(nombre);
		this.cliente.setDireccion(direccion);
		this.cliente.setTelefono(telefono);
		
		this.libro.setNombre(nombreLibro);
		this.libro.setPrecio(precio);

		return "Libro "+libro.getNombre()+" vendido a " + this.cliente.getNombre() + " A un precio de: " + this.libro.getPrecio();
	}
	public ClienteLibreria getCliente() {
		return cliente;
	}

	public void setCliente(ClienteLibreria cliente) {
		this.cliente = cliente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	

	
}
