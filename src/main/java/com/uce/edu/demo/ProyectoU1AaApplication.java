package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1AaApplication implements CommandLineRunner {

	@Autowired
	private IRetiroService retiroService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.retiroService.realizar("111", new BigDecimal(10));
	}

}
