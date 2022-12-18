package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Medico;
import com.example.demo.modelo.Paciente;

public interface ICitaMedicaService {
	
	public void insertar(CitaMedica citaMedica);
	public CitaMedica buscar(String numero);
	public void actualizar(CitaMedica citaMedica);
	public void eliminar(String numero);
	
	public void agendar(String numero, LocalDateTime fcita,	Paciente ph,Medico mh);
}
