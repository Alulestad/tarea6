package com.example.demo.repository;

import com.example.demo.modelo.Medico;

public interface IMedicoRepository {

	public void insertar(Medico medico);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
	public void eliminar(String cedula);
}
