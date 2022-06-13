package com.uce.edu.demo.santa.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.santa.modelo.Inventario;
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{
	private List<Inventario> lista=new ArrayList<>();
	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un nuevo inventario");
		lista.add(inventario);
	}

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Inventario enntrado con el codigo: "+ codigo);
		return null;
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario: "+ inventario);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario con codigo: "+ codigo);
	}
	public List<Inventario> consultar(LocalDateTime fecha){
		
		List<Inventario> listaConsultada=new ArrayList<>();
		for(Inventario i:lista) {
			if(fecha.compareTo(i.getFechaIngreso())<=0) {
				listaConsultada.add(i);
				
			}
		}
		return listaConsultada;
	}

}
