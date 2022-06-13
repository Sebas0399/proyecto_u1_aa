package com.uce.edu.demo.santa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IInventarioService {
	public void insertar(String codigo,String nombre,BigDecimal precio,Integer cantidad,LocalDateTime fechaIngreso);
}
