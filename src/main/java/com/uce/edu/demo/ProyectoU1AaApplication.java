package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.terminal.modelo.Bus;
import com.uce.edu.demo.terminal.modelo.Pasaje;
import com.uce.edu.demo.terminal.modelo.Persona;
import com.uce.edu.demo.terminal.service.GestorPasaje;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	@Autowired
	private GestorPasaje gPasaje;
	@Autowired
	@Qualifier("interprovincial")
	private Pasaje pInterprovincial;
	@Autowired
	@Qualifier("intercantonal")
	private Pasaje pInterCantonal;
	
	@Autowired
	Persona persona1;
	
	@Autowired
	Bus busInterporvincial;
	
	@Autowired
	Bus busIntercantonal;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("SINGLETON");
//		this.general.setNombre("Jose");
//		this.general.setApellido("Andrade");
//		System.out.println(this.general);
//		System.out.println("--------------");
//		System.out.println(this.general1);
//		this.general1.setNombre("Pepito");
//		System.out.println("--------------");
//		System.out.println(this.general1);
//		System.out.println("PROTOTYPE");
//		
//		this.materia.setNombre("Jose");
//		this.materia.setApellido("Andrade");
//		System.out.println(this.materia);
//		System.out.println("--------------");
//		System.out.println(this.materia1);
//		this.materia1.setNombre("Pepito");
//		System.out.println("--------------");
//		System.out.println(this.materia1);
//		
//		Matricula matricula1=new Matricula();
//		matricula1.setEstudiante(new Estudiante());
//		matricula1.setMateria(new ArrayList<Materia>());
//		matricula1.setNumero("1");
//		System.out.println("--------------");
//		
//		this.matriculaService.ingrersarMatricula(matricula1);
		
		
		this.persona1.setNombre("Antony");
		this.persona1.setCedula("1725776650");
		this.persona1.setDireccion("Martha Bucaram");
		
		
		this.busInterporvincial.setCapacidad("40");
		this.busInterporvincial.setPatente("PCA-321");
		
		
		this.pInterprovincial.setBus(busInterporvincial);
		this.pInterprovincial.setFecha(LocalDateTime.of(2022, 12, 20,13,50));
		this.pInterprovincial.setIdPasaje("1725321");
		this.pInterprovincial.setNroAsiento("12");
		this.pInterprovincial.setPasajero(persona1);
		this.pInterprovincial.setPrecio(new BigDecimal(12));
		this.busInterporvincial.setCapacidad("30");
		
		this.gPasaje.registarPasaje(this.pInterprovincial);
		System.out.println(this.pInterprovincial);
		System.out.println("Precio Final: "+gPasaje.cobrarPasaje(this.pInterprovincial));
		
		this.pInterCantonal.setBus(busIntercantonal);
		this.pInterCantonal.setFecha(LocalDateTime.of(2022, 12, 22,1,50));
		this.pInterCantonal.setIdPasaje("1725623");
		this.pInterCantonal.setNroAsiento("10");
		this.pInterCantonal.setPasajero(persona1);
		this.pInterCantonal.setPrecio(new BigDecimal(5));
		this.busIntercantonal.setCapacidad("39");
		
		this.gPasaje.registarPasaje(this.pInterCantonal);
		System.out.println(pInterCantonal);
		System.out.println("Precio Final: "+gPasaje.cobrarPasaje(this.pInterCantonal));
		
		
		
	}

}
