package com.uce.edu.demo.santa.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santa.modelo.Inventario;
import com.uce.edu.demo.santa.modelo.Producto;
import com.uce.edu.demo.santa.repository.IInventarioRepository;
import com.uce.edu.demo.santa.to.GestorInventarioTo;
@Service
public class GestorInventarioImpl implements IGestorInventario{
	@Autowired
	private IInventarioRepository inventarioRepo;
	private static final BigDecimal IVA=new BigDecimal(0.12);
	@Override
	public BigDecimal calculoPrecio(Producto producto) {
		// TODO Auto-generated method stub
		BigDecimal porcentajeGanancia=new BigDecimal(0.10);
		
		BigDecimal ganancia=producto.getPrecio().multiply(porcentajeGanancia);
		BigDecimal productoIva=producto.getPrecio().multiply(IVA);
		
		return producto.getPrecio().add(productoIva).add(ganancia);
	}
	public List<GestorInventarioTo> consultar(LocalDateTime fechaIngreso){
		List<Inventario> listaProductos=this.inventarioRepo.consultar(fechaIngreso);
		List<GestorInventarioTo> listaFinal=new ArrayList<>();
		//Unimos las listas
		for(Inventario i: listaProductos) {
			GestorInventarioTo gestor=this.transformar(i);
			listaFinal.add(gestor);
		}
		for(GestorInventarioTo g: listaFinal) {
			System.out.println(g);
		}
		return listaFinal;
		
	}
	private GestorInventarioTo transformar(Inventario inventario) {
		GestorInventarioTo gestorTo=new GestorInventarioTo();
		gestorTo.setCantidad(inventario.getCantidad());
		gestorTo.setNombre(inventario.getProducto().getNombre());
		gestorTo.setPrecio(this.calculoPrecio(inventario.getProducto()).round(new MathContext(2)));
		gestorTo.setFechaIngreso(inventario.getFechaIngreso());
		
		return gestorTo;
	}
	
}
