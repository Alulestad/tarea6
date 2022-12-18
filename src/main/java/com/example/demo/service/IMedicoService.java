package com.example.demo.service;

import com.example.demo.modelo.Medico;

public interface IMedicoService {

	
	public void agregar(Medico medico);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
	public void borrar(String cedula);
	
}
