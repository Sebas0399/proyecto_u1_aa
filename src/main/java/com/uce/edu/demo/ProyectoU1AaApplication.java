package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.libreria.VentaLibreria;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	// DI por atributo
//	@Autowired
//	private CitaMedica cita;

	@Autowired
	private CitaMedica cita;
	@Autowired
	private VentaLibreria venta;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("mi primer proyecto con Spring Framework");
		System.out.println(this.cita.agendar(null, null, null, 0, null, null, 0));
		System.out.println(this.venta.vender(" Antony", "La Ecuatoriana", "0986348330", "Harry Potter",25.75));
	}

}
