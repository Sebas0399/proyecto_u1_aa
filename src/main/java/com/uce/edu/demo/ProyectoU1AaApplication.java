package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {
	//DI por atributo
//	@Autowired
//	private CitaMedica cita;
	
	@Autowired
	private CitaMedica2 cita2;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("mi primer proyecto con Spring Framework");
		System.out.println(this.cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19));
	}

}
