package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.modelo.Medico;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IMedicoService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Tarea6Application implements CommandLineRunner{
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private IMedicoService iMedicoService;
	
	@Autowired
	private IPacienteService iPacienteService;

	public static void main(String[] args) {
		SpringApplication.run(Tarea6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Paciente pacienteTE=new Paciente();
		pacienteTE.setCedula("23423423");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("C");
	
		Medico medico=new Medico();
		medico.setCedula("24353246");
		medico.setNombre("Medico Luis");
		
		citaMedicaService.agendar(null, null, pacienteTE, medico);
		
	}

}
