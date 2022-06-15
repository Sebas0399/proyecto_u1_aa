package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorGeneral general1;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService matriculaService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SINGLETON");
		this.general.setNombre("Jose");
		this.general.setApellido("Andrade");
		System.out.println(this.general);
		System.out.println("--------------");
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("--------------");
		System.out.println(this.general1);
		System.out.println("PROTOTYPE");
		
		this.materia.setNombre("Jose");
		this.materia.setApellido("Andrade");
		System.out.println(this.materia);
		System.out.println("--------------");
		System.out.println(this.materia1);
		this.materia1.setNombre("Pepito");
		System.out.println("--------------");
		System.out.println(this.materia1);
		
		Matricula matricula1=new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1");
		System.out.println("--------------");
		
		this.matriculaService.ingrersarMatricula(matricula1);
	}

}
