package com.example.demo.repository;

import com.example.demo.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente paciente);
	public Paciente buscar(String cedula);
	public void actualizar(Paciente paciente);
	public void eliminar(String cedula);
	
}
