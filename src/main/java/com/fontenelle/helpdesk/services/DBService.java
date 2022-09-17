package com.fontenelle.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fontenelle.helpdesk.domain.Chamado;
import com.fontenelle.helpdesk.domain.Cliente;
import com.fontenelle.helpdesk.domain.Tecnico;
import com.fontenelle.helpdesk.domain.enums.Prioridade;
import com.fontenelle.helpdesk.domain.enums.Status;
import com.fontenelle.helpdesk.repository.ChamadoRepository;
import com.fontenelle.helpdesk.repository.ClienteRepository;
import com.fontenelle.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired 
	ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null,"fontenelle", "487.362.010-49", "raphaelfontenelle@gmail.com", "123");
		Cliente cli1 = new Cliente(null, "Linux","237.302.070-08","raphaelfontenelle2@gmail.com", "123");
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamdo 01", "Primeiro Chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}


}
