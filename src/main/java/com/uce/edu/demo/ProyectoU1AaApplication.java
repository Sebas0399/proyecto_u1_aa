package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.santa.service.IGestorInventario;
import com.uce.edu.demo.santa.service.IInventarioService;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {

	
	@Autowired
	private IInventarioService inventarioService;
	@Autowired
	private IGestorInventario gestorService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.inventarioService.insertar("1234","Galletas Amor",new BigDecimal(1.25),200,LocalDateTime.of(2022, 1, 2, 13, 45) );
		this.inventarioService.insertar("2457","CocaCola 1lt",new BigDecimal(1.35),100 ,LocalDateTime.of(2022, 2, 3, 14,46));
		this.inventarioService.insertar("5789","Canguil 1kgr",new BigDecimal(1.55),50 ,LocalDateTime.of(2022, 3, 4, 14,46));
		this.inventarioService.insertar("7894","BigCola 500ml",new BigDecimal(0.50),150 ,LocalDateTime.of(2022,4, 5, 14,46));
		this.inventarioService.insertar("9874","Harina 2kg",new BigDecimal(2.50),200 ,LocalDateTime.of(2022, 5, 6, 14,46));
		this.inventarioService.insertar("8412","Yogurt 900ml",new BigDecimal(1.15),100 ,LocalDateTime.of(2022,6, 7, 14,46));
		this.inventarioService.insertar("1234","Detergente 5kg",new BigDecimal(7.25),50 ,LocalDateTime.of(2022,7, 8, 14,46));
		this.gestorService.consultar(LocalDateTime.of(2022,4, 5, 14,46));
	}

}
