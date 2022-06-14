package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {
	@Override
	public void insertarDeposito(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + deposito);
	}

	@Override
	public void actualizar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actulizado el deposito:" + deposito);
	}

	@Override
	public Deposito buscar(String numeroCuenta) {
		System.out.println("Se busca el deposito a la cuenta bancaria: " + numeroCuenta);

		return null;

		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito a la cuenta: " + numeroCuenta);
	}

	@Override
	public List<Deposito> consular(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaConsultada = new ArrayList<>();
		Deposito dep1 = new Deposito();
		dep1.setFechaDeposito(LocalDateTime.of(2022, 10, 20, 11, 24, 2));
		dep1.setNumeroCuenta("1234");
		dep1.setMonto(new BigDecimal(10));
		
		Deposito dep2 = new Deposito();
		dep2.setFechaDeposito(LocalDateTime.of(2021, 9, 11, 11, 14, 20));
		dep2.setNumeroCuenta("1234");
		dep2.setMonto(new BigDecimal(100));
		
		listaConsultada.add(dep2);
		listaConsultada.add(dep1);
		return listaConsultada;

	}
}
