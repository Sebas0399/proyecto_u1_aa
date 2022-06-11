package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class TrasferenciaRepositoryImpl implements ITrasnferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia insertada:"+t);
	}

	@Override
	public Transferencia buscar(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia en contrada de: "+cuentaOrigen +"a "+cuentaDestino);
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia actualizada: "+transferencia);
	}

	@Override
	public void eliminar(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia eliminada de: "+cuentaOrigen +"a "+cuentaDestino);
	}

	@Override
	public List<Transferencia> consular(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//SQL a la base
		List<Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(10));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("1358");
		
		Transferencia trans2=new Transferencia();
		trans2.setFechaTransferencia(LocalDateTime.of(2021, 1, 30, 13, 11,4));
		trans2.setMontoTransferir(new BigDecimal(40));
		trans2.setNumeroCuentaDestino("1234");
		trans2.setNumeroCuentaOrigen("1457");
		listaConsultada.add(trans2);
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
