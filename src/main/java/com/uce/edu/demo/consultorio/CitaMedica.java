package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {
	private Doctor doctor;
	private Paciente paciente;
	//2) DI por constructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor = doctor;
		this.paciente = paciente;
	}

	private LocalDateTime fechaCita;

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);
		// Seteamos los atributos
		this.fechaCita = fechaCita;
		return "Cita agendada";
	}

//GET y SET
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
