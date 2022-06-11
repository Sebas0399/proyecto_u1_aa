package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el retiro"+ r);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Retiro encotrado de la cuenta: "+numeroCuenta);
		return null;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Retiro actualizado: "+r);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Retiro eliminado de la cuenta: "+numeroCuenta);
	}

	@Override
	public List<Retiro> consular(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaConsultada=new ArrayList<>();
		Retiro ret1=new Retiro();
		ret1.setFechaRetiro(LocalDateTime.of(2022,10, 20, 11, 24,2));
		ret1.setNumeroCuenta("1234");
		ret1.setMonto(new BigDecimal(10));
		
		Retiro ret2=new Retiro();
		ret2.setFechaRetiro(LocalDateTime.of(2019,4, 12, 10, 14,2));
		ret2.setNumeroCuenta("1234");
		ret2.setMonto(new BigDecimal(40));
		listaConsultada.add(ret1);
		listaConsultada.add(ret2);
		return listaConsultada;
	}

}
