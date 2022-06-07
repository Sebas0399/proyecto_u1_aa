package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IMateriaService materiaService;
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
		
		//Materia
		Materia materia1 = new Materia();
		materia1.setNombre("Inteligencia Artificial");
		materia1.setSemestre("6");
		
		Materia materia2 = new Materia();
		materia2.setNombre("Redes");
		materia2.setSemestre("6");
		
		Materia materia3 = new Materia();
		materia3.setNombre("Programacion Avanzada");
		materia3.setSemestre("6");
		
		Materia materia4 = new Materia();
		materia4.setNombre("Calculo Diferencial");
		materia4.setSemestre("6");
		List<Materia> materias=new ArrayList<Materia>();
		//Service Materia
		materia1.setNombre("IA");
		this.materiaService.actualizarMateria(materia1);
		this.materiaService.buscarPorMateria("Redes");
		this.materiaService.eliminarMateria("Calculo Diferencial");
		//Matricula
		Matricula matricula1=new Matricula();
		matricula1.setEstudiante(e);
		matricula1.setNumero("111022");
		matricula1.setMateria(materias);
		
		Matricula matricula2=new Matricula();
		matricula2.setEstudiante(e1);
		matricula2.setNumero("235874");
		matricula2.setMateria(materias);
		
		
		// Service Matricula
		matricula2.setNumero("235486");
		this.matriculaService.actualizarMatricula(matricula2);
		this.matriculaService.buscarPorNumero("111022");
		this.matriculaService.eliminarMatricula("235874");
		}

}
