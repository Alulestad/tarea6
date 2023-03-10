package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository {
	
	private static List<Paciente> base=new ArrayList<>();

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		base.add(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente=null;
		for (Paciente p:base) {
			if (p.getCedula().equals(cedula)) {
				paciente=p;
			}
		}
		
		return paciente;
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		Paciente pacienteAntigua=null;
		for (Paciente p:base) {
			if (p.getCedula().equals(paciente.getCedula())) {
				pacienteAntigua=p;
			}
		}
		base.remove(pacienteAntigua);
		base.add(paciente);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente=this.buscar(cedula);
		base.remove(paciente);
	}

}
