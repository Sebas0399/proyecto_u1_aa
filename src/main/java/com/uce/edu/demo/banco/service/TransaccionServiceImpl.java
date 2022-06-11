package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITrasnferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;
@Service
public class TransaccionServiceImpl implements ITransaccionService{
	@Autowired
	private ITransferenciaService iTransferencia;
	@Autowired
	private IDepositoService iDeposito;
	@Autowired
	private IRetiroService iRetiro;
	
	private ITrasnferenciaRepository transferenciaRepo;
	private IDepositoRepository depositoRepo;
	private IRetiroRepository retiroRepo;
	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferencia.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDeposito.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String origen, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiro.realizar(origen, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans=this.transferenciaRepo.consular(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo=this.depositoRepo.consular(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti=this.retiroRepo.consular(cuenta, fechaInicio, fechaFin);
		//Vamos aunir todas las litas
		List<TransaccionTo> listaFinal=new ArrayList<>();
		for(Transferencia t:listaTrans ) {
			TransaccionTo transaccionTo=this.transformar(t);
			listaFinal.add(transaccionTo);
		}
		for(Deposito d:listaDepo ) {
			TransaccionTo transaccionTo=this.transformar(d);
			listaFinal.add(transaccionTo);
		}
		for(Retiro r:listaReti ) {
			TransaccionTo transaccionTo=this.transformar(r);
			listaFinal.add(transaccionTo);
		}
		return listaFinal;
	}
	private TransaccionTo transformar(Transferencia transferencia) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(transferencia.getFechaTransferencia());
		tranTo.setMonto(transferencia.getMontoTransferir());
		tranTo.setTipo("T");
		return tranTo;
	}
	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(deposito.getFechaDeposito());
		tranTo.setMonto(deposito.getMonto());
		tranTo.setTipo("D");
		return tranTo;
	}
	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(retiro.getFechaRetiro());
		tranTo.setMonto(retiro.getMonto());
		tranTo.setTipo("R");
		return tranTo;
	}

	

}
