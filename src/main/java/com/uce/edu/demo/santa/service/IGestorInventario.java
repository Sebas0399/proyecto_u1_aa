package com.uce.edu.demo.santa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santa.modelo.Producto;
import com.uce.edu.demo.santa.to.GestorInventarioTo;

public interface IGestorInventario {
	public  BigDecimal calculoPrecio(Producto producto);
	public List<GestorInventarioTo> consultar(LocalDateTime fechaIngreso);
}
