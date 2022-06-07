package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante e=new Estudiante();
		e.setNombre("Antony");
		e.setApellido("Arguello");
		e.setCedula("1725776650");
		this.estudianteService.ingrersarEstudiante(e);
		
		Estudiante e1=new Estudiante();
		e1.setNombre("Juan");
		e1.setApellido("Romero");
		e1.setCedula("1723667740");
		this.estudianteService.ingrersarEstudiante(e1);
		
		e.setCedula("1725664480");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Cayambe");
		this.estudianteService.eliminarEstudiante("1725776650");
	}

}
