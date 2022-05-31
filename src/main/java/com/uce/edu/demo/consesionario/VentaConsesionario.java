package com.uce.edu.demo.consesionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VentaConsesionario {
	private Auto auto;
	private ClienteConsesionario cliente;
	
	
	public String vender(String nombre,String direccion,String telefono,String marca,double precio,String placa) {
		this.auto.setMarca(marca);
		this.auto.setPrecio(precio);
		this.auto.setPlaca(placa);
		
		this.cliente.setNombre(nombre);
		this.cliente.setDireccion(direccion);
		this.cliente.setTelefono(telefono);
		
		return "Auto vendido a"+this.cliente.getNombre()+" A un precio de: "+this.auto.getPrecio();
	}
	public Auto getAuto() {
		return auto;
	}
	@Autowired
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public ClienteConsesionario getCliente() {
		return cliente;
	}
	@Autowired
	public void setCliente(ClienteConsesionario cliente) {
		this.cliente = cliente;
	}
	
}
