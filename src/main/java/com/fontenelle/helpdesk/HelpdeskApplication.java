package com.fontenelle.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fontenelle.helpdesk.domain.Chamado;
import com.fontenelle.helpdesk.domain.Cliente;
import com.fontenelle.helpdesk.domain.Tecnico;
import com.fontenelle.helpdesk.domain.enums.Prioridade;
import com.fontenelle.helpdesk.domain.enums.Status;
import com.fontenelle.helpdesk.repository.ChamadoRepository;
import com.fontenelle.helpdesk.repository.ClienteRepository;
import com.fontenelle.helpdesk.repository.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired 
	ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tecnico tec1 = new Tecnico(null,"fontenelle", "09555004781", "raphaelfontenelle@gmail.com", "123");
		Cliente cli1 = new Cliente(null, "Linux","09555004782","raphaelfontenelle2@gmail.com", "123");
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamdo 01", "Primeiro Chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
